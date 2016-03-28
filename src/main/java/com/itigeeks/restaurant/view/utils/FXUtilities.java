package com.itigeeks.restaurant.view.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.persistence.Column;

import sun.util.resources.LocaleData;

import com.itigeeks.restaurant.common.annotation.Definable;
import com.itigeeks.restaurant.common.annotation.DisplayOrder;
import com.itigeeks.restaurant.common.annotation.DisplayOrderFieledsComprator;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.utils.BeanFactory;
import com.itigeeks.restaurant.common.utils.Utils;
import com.itigeeks.restaurant.configuration.Config;
import com.sun.xml.internal.messaging.saaj.util.TeeInputStream;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.util.Callback;

public class FXUtilities {


  static {
    config = BeanFactory.getBean(Config.class);
  }
  private final static Config config;


  public static List<TableColumn> generateTableColumn(final Class cls, String[] fieldNames) {

    if (Utils.isNotNull(fieldNames)) {
      return generateTableColumn(cls, Arrays.asList(fieldNames));
    } else {
      return generateTableColumn(cls, new ArrayList<String>());
    }

  }

  public static List<TableColumn> generateTableColumn(final Class cls, List<String> fieldNames) {

    List<TableColumn> result = new ArrayList<TableColumn>();
    List<Field> displayedFields = getDisplayedFields(cls);

    for (String fieldName : fieldNames) {
      try {
        final Field field = cls.getDeclaredField(fieldName);
        if (Utils.isPrimitiveDataType(field.getType()) || field.getType() == String.class|| field.getType()==Date.class) 
        {
          TableColumn tableColumn = new TableColumn(field.getName());
          tableColumn
              .setCellValueFactory(new Callback<CellDataFeatures<Object, String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<Object, String> c) {
                  Object getterVal = Utils.getGetterValueOf(field, c.getValue());
                  if (getterVal instanceof Date) {
                    getterVal = Utils.dateToString((Date) getterVal, config.getDefaultDateFormat());
                  }
                  return new SimpleStringProperty(Utils.getAbsoluteStringValue(getterVal));

                }
              });
          result.add(tableColumn);
        } 
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }

    return result;

  }

  private static List<Field> getDisplayedFields(Class<? extends Object> class1) {
    List<Field> fields = new ArrayList<Field>();
    for (Field field : class1.getDeclaredFields()) {
      boolean isAnnotaedBy = Utils.isFieldAnnotatedBy(field, DisplayOrder.class);
      if (isAnnotaedBy) {
        fields.add(field);
      }
    }
    Collections.sort(fields, new DisplayOrderFieledsComprator());
    return fields;
  }

  public static Date localeDateToDate(LocalDate localDate) {
    Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
    return date;

  }

  public static void inheritValuesFromControls(Object obj, Node[] nodes) {

    for (Field f : obj.getClass().getDeclaredFields()) {

      if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {

        if (Utils.isPrimitiveDataType(f.getType()) || f.getType() == String.class) {
          for (Node node : nodes) {
            if (node instanceof TextField) {
              String nodeId = node.getId();
              String trimmedNodeId = Utils.trim(nodeId, "TextField");
              if (f.getName().equals(trimmedNodeId)) {
                TextField textField = (TextField) node;

                String setterMethodName = Utils.getFieldSetterString(f);

                try {
                  Object val =
                      Utils.isNotNull(textField.getText()) ? Utils.initiateObjectOfValue(
                          f.getType(), textField.getText()) : null;
                  Method setterMethod = obj.getClass().getMethod(setterMethodName, f.getType());
                  setterMethod.invoke(obj, val);
                } catch (Exception ex) {
                  // do nothing
                  // I just used this way because i'm lazy :) :)
                }
              }
            }
          }
        }

      }
    }
  }


  public static void attachValidationListeners(Object obj, Node[] nodes) {
    for (Node node : nodes) {
      if (Utils.isNotEmptyString(node.getId())) {
        String nodeId = node.getId();
        if (node instanceof TextField) {

          String trimmedNodeId = Utils.trim(nodeId, "TextField");

          try {
            Field f = obj.getClass().getDeclaredField(trimmedNodeId);
            if (f != null) {
              if (f.isAnnotationPresent(Column.class)) {
                Column column = f.getAnnotation(Column.class);
                if (column.length() != 0) {
                  attachLengthListener((TextField) node, column.length());
                }
                if (Utils.isNumericField(f)) {
                  attachNumericValidationListener((TextField) node, f.getType());
                }
              }
            }
          } catch (NoSuchFieldException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
        }
      }


    }
  }



  private static void attachNumericValidationListener(final TextField tf, final Class<?> type) {
    tf.textProperty().addListener(new ChangeListener<String>() {

      @Override
      public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
        if (Utils.isNotEmptyString(newValue)) {
          try {
            Object result = Utils.initiatePrimitiveObject(type, newValue);
            if (result != null) {
              tf.setText(newValue);
            } else {
              tf.setText(oldValue);
            }
          } catch (Exception ex) {
            tf.setText(oldValue);
          }

        }

      }
    });


  }

  private static void attachLengthListener(final TextField tf, final int maxLength) {
    tf.textProperty().addListener(new ChangeListener<String>() {
      @Override
      public void changed(ObservableValue<? extends String> arg0, String oldValue, String newValue) {
        if (tf.getText().length() > maxLength) {
          String s = tf.getText().substring(0, maxLength);
          tf.setText(s);
        }else
        {
          tf.setText(newValue);
        }
      }
    });
  }
}
