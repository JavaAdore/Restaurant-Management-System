package com.itigeeks.restaurant.common.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.utils.Utils;

public class SearchingCriteria implements Serializable {

	public SearchingCriteria() {
		super();
	}

	public SearchingCriteria(String keyWord) {
		super();
		this.keyWord = keyWord;
	}

	private String keyWord;

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Map<String, Object> prepareSearchingCriteria(Class<ResCustomer> cls) {

		Map<String, Object> searchCriteria = new HashMap();
		if (Utils.isNotEmptyString(keyWord)) {
			for (Field f : cls.getFields()) {
				searchCriteria.put(f.getName(), keyWord);
			}
		}
		return searchCriteria;
	}
}
