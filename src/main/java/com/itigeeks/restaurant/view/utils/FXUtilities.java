package com.itigeeks.restaurant.view.utils;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.itigeeks.restaurant.common.annotation.Definable;
import com.itigeeks.restaurant.common.annotation.DisplayOrder;
import com.itigeeks.restaurant.common.annotation.DisplayOrderFieledsComprator;
import com.itigeeks.restaurant.common.utils.Utils;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

public class FXUtilities {

	public static List<TableColumn> generateTableColumn(final Class cls,
			List<String> fieldNames) {
		List<TableColumn> result = new ArrayList<TableColumn>();
		List<Field> displayedFields = getDisplayedFields(cls);

		for (String fieldName : fieldNames) {
			try {
				final Field field = cls.getDeclaredField(fieldName);
				if (Utils.isPrimitiveDataType(field.getType())
						|| field.getType() == String.class) {
					TableColumn tableColumn = new TableColumn(field.getName());
					tableColumn
							.setCellValueFactory(new Callback<CellDataFeatures<Object, String>, ObservableValue<String>>() {
								@Override
								public ObservableValue<String> call(
										CellDataFeatures<Object, String> c) {
									Object getterVal = Utils.getGetterValueOf(
											field, c.getValue());
									return new SimpleStringProperty(Utils
											.getAbsoluteStringValue(getterVal));
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
			boolean isAnnotaedBy = Utils.isFieldAnnotatedBy(field,
					DisplayOrder.class);
			if (isAnnotaedBy) {
				fields.add(field);
			}
		}
		Collections.sort(fields, new DisplayOrderFieledsComprator());
		return fields;
	}
}
