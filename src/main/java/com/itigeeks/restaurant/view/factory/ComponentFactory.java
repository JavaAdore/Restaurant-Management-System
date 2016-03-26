package com.itigeeks.restaurant.view.factory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.entity.schema.ResUser;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.itigeeks.restaurant.common.utils.Utils;
import com.itigeeks.restaurant.view.LoginUserComponent;

@Controller
public class ComponentFactory {

  @Autowired
  private RestaurantFacade restaurantFacade;

  public List<LoginUserComponent> createLoginUsers(PagingDetailsHolder pagingDetailsHolder,
      PagingDirection direction) {

    int countOfAllUsers = restaurantFacade.getCountOfAllUsers();

    if (countOfAllUsers == 0) {
      // their is no need to hit the database again and fetch no row
      return new ArrayList<LoginUserComponent>();
    }

    pagingDetailsHolder.adjustStartResultToMatchDirection(countOfAllUsers, direction);

    List<ResUser> users =
        restaurantFacade.loadUsers(pagingDetailsHolder, pagingDetailsHolder.getStartResult(),
            pagingDetailsHolder.getPageSize());


    return createLoginUserComponents(users);

  }

  private List<LoginUserComponent> createLoginUserComponents(List<ResUser> users) {
    List<LoginUserComponent> loginUserComponents = new ArrayList<LoginUserComponent>();

    for (ResUser resUser : users) {
      String userName = resUser.getUserName();
      if (!Utils.isEmptyString(userName)) {
        LoginUserComponent loginUserComponent = createLoginUserComponent(userName);
        loginUserComponents.add(loginUserComponent);
      }
    }
    return loginUserComponents;
  }

  private LoginUserComponent createLoginUserComponent(String userName) {
    String[] spillitedUserName = splitUserName(userName);
    String firstName = spillitedUserName[0];
    String lastName = spillitedUserName[1];
    return new LoginUserComponent(firstName, lastName);
  }

  private String[] splitUserName(String userName) {
    String firstName = "";
    String lastName = "";
    int indexOfFirstSpace = userName.indexOf("\\s");

    if (indexOfFirstSpace != -1) {
      firstName = userName.substring(0, indexOfFirstSpace);
      lastName = userName.substring(indexOfFirstSpace, userName.length() - 1);
    } else {
      firstName = userName;
    }
    return new String[] {firstName, lastName};

  }

}
