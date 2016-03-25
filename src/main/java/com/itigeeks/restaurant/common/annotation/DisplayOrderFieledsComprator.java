package com.itigeeks.restaurant.common.annotation;

import java.lang.reflect.Field;
import java.util.Comparator;

public class DisplayOrderFieledsComprator implements Comparator<Field> {

	@Override
	public int compare(Field field1, Field field2) {

		try {
			if (field1 != null && field2 != null) {
				
				DisplayOrder firstFieldAnnotataion = field1.getAnnotation(DisplayOrder.class);
				DisplayOrder secondFieldAnnotation = field2.getAnnotation(DisplayOrder.class);
				if(firstFieldAnnotataion !=null && secondFieldAnnotation !=null)
				{
					Integer firstFieldAnnotationOrder = firstFieldAnnotataion.order();
					Integer secondFieldAnnotationOrder = firstFieldAnnotataion.order();
					if(firstFieldAnnotationOrder !=null && secondFieldAnnotationOrder !=null )
					{
						return firstFieldAnnotationOrder.compareTo(secondFieldAnnotationOrder);
					}
				}

			}

		} catch (Exception ex) {
			// just ignore
		}
		return 0;

	}

}
