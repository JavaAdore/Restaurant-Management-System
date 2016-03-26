package com.itigeeks.restaurant.view;

import java.io.IOException;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class LoginUserComponent extends AnchorPane {

  @FXML
  private ImageView roleImageView;
  @FXML
  private Label firstNameLabel;

  @FXML
  private Label lastNameLabel;

  private String userName = "";

  public LoginUserComponent() {

    this("", "");
  }

  public LoginUserComponent(String firstName, String lastName) {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginUserComponent.fxml"));
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.load();
      setLabelsTextValues(firstName, lastName);
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }

  private void setLabelsTextValues(String firstName, String lastName) {
    userName = firstName + " " + lastName;
    firstNameLabel.setText(firstName);
    lastNameLabel.setText(lastName);
  }

  public String getUserName() {
    return userName.trim();
  }

  public void setDefaultEventListeners(EventHandler userComponentDefaultListener) {
    setOnTouchReleased(userComponentDefaultListener);
    setOnMouseClicked(userComponentDefaultListener);
    setOnKeyReleased(userComponentDefaultListener);

  }
}
