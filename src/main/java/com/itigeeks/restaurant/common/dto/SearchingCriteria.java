package com.itigeeks.restaurant.common.dto;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import sun.font.LayoutPathImpl.EndType;

import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.utils.Utils;

public class SearchingCriteria implements Serializable {

  enum MatchType {
    STARTWITH, ANYWHERE
  }

  private String keyWord;

  private MatchType matchType = MatchType.ANYWHERE;

  public SearchingCriteria() {
    super();
  }

  public SearchingCriteria(String keyWord) {
    super();
    this.keyWord = keyWord;
  }


  public String getKeyWord() {
    if (keyWord != null && keyWord.trim().length() >= 1) {
      keyWord =
          matchType == MatchType.STARTWITH ? keyWord.trim() + "%" : "%" + keyWord.trim() + "%";
    } else {
      keyWord = "%%";
    }
    return keyWord;
  }

  public void setKeyWord(String keyWord) {
    this.keyWord = keyWord;
  }

  public Map<String, Object> prepareSearchingCriteria(Class<ResCustomer> cls,
      String[] fieldsToBeDisplayed) {
    List<String> fieldNames = new ArrayList();
    if (fieldsToBeDisplayed != null) {
      fieldNames = Arrays.asList(fieldsToBeDisplayed);
    }
    Map<String, Object> searchCriteria = new HashMap();
    if (Utils.isNotEmptyString(getKeyWord())) {
      for (Field f : cls.getDeclaredFields()) {
        if (!java.lang.reflect.Modifier.isStatic(f.getModifiers())) {
          if (Utils.isNotEmptyList(fieldNames)) {
            if (fieldNames.contains(f.getName())) {
              searchCriteria.put(f.getName(), keyWord);
            }
          } else {
            searchCriteria.put(f.getName(), keyWord);

          }

        }
      }
    }
    return searchCriteria;
  }
}
