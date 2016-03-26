package com.itigeeks.restaurant.view;

import java.io.IOException;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.itigeeks.restaurant.common.utils.BeanFactory;
import com.itigeeks.restaurant.view.factory.ComponentFactory;

public class LoginController extends AnchorPane {

  final private RestaurantFacade restaurantFacade;
  ComponentFactory componentFactory;

  @FXML
  private GridPane usersGridPane;

  @FXML
  private TextField userNameTextField;

  @FXML
  private PasswordField passwordField;

  @FXML
  private Button nextPageButton;

  @FXML
  private Button previousPageButton;

  PagingDetailsHolder pagingDetailsHolder = new PagingDetailsHolder();

  public LoginController() throws IOException {
    try {
      restaurantFacade = BeanFactory.getBean(RestaurantFacade.class);
      componentFactory = BeanFactory.getBean(ComponentFactory.class);
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("login.fxml"));
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.load();
      initializeForm();
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  private void initializeForm() {
    loadUsers();
    assignListeners();

  }

  private void assignListeners() {
    previousPageButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent arg0) {

        loadUsersPage(PagingDirection.PREVIOUS);
      }
    });
    nextPageButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent arg0) {
        loadUsersPage(PagingDirection.NEXT);

      }
    });

  }

  private void loadUsers() {

    loadUsersPage(PagingDirection.NEXT);

  }

  public void loadUsersPage(PagingDirection direction) {

    List<LoginUserComponent> userLoginComponents =
        componentFactory.createLoginUsers(pagingDetailsHolder, direction);
    clearUsersGridPane();
    int column = 0, row = 0, counter = 0;
    EventHandler userComponentDefaultListener = getUserComponentDefaultListener();
    for (LoginUserComponent currentUserComponent : userLoginComponents) {
      currentUserComponent.setDefaultEventListeners(userComponentDefaultListener);
      usersGridPane.add(currentUserComponent, column++, row);
      column = (column > 1) ? 0 : column;
      counter++;
      if (counter >= 2) {
        counter = 0;
        row++;
      }
    }

  }

  private void clearUsersGridPane() {
    usersGridPane.getChildren().clear();
  }

  private EventHandler<Event> getUserComponentDefaultListener() {
    return new EventHandler<Event>() {

      @Override
      public void handle(Event event) {

        String userName = ((LoginUserComponent) event.getSource()).getUserName();
        userNameTextField.setText(userName);

      }

    };
  }

  public void loadPreviousPage() {}

  public static void main(String[] args) {
    System.out.println(4 % 2);
  }

}
