package com.itigeeks.restaurant.view.utils;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import sun.util.resources.LocaleData;

import com.itigeeks.restaurant.common.annotation.Definable;
import com.itigeeks.restaurant.common.annotation.DisplayOrder;
import com.itigeeks.restaurant.common.annotation.DisplayOrderFieledsComprator;
import com.itigeeks.restaurant.common.utils.BeanFactory;
import com.itigeeks.restaurant.common.utils.Utils;
import com.itigeeks.restaurant.configuration.Config;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class FXUtilities {
 
  
  static {
    config = BeanFactory.getBean(Config.class);
  }
  private final static Config config ;

  
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
        if (Utils.isPrimitiveDataType(field.getType()) || field.getType() == String.class) {
          TableColumn tableColumn = new TableColumn(field.getName());
          tableColumn
              .setCellValueFactory(new Callback<CellDataFeatures<Object, String>, ObservableValue<String>>() {
                @Override
                public ObservableValue<String> call(CellDataFeatures<Object, String> c) {
                  Object getterVal = Utils.getGetterValueOf(field, c.getValue());
                  if(getterVal instanceof Date)
                  {
                    getterVal = Utils.dateToString((Date)getterVal,config.getDefaultDateFormat());
                  }
                  return new SimpleStringProperty(Utils.getAbsoluteStringValue(getterVal));
                  
                }
              });
          result.add(tableColumn);
        } else if (Utils.isFieldAnnotatedBy(field, Definable.class)) {

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
}
