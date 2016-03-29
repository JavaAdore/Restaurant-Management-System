package com.itigeeks.restaurant.view;

import java.io.IOException;

import com.itigeeks.restaurant.common.entity.schema.ResUser;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.TextAlignment;

public class LoginUserComponent extends AnchorPane {

  @FXML
  private ImageView roleImageView;
  @FXML
  private Label firstNameLabel;

  @FXML
  private Label lastNameLabel;

  private String userName = "";

  public LoginUserComponent() {

    
  }

 

  public LoginUserComponent(ResUser resUser) {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("loginUserComponent.fxml"));
      fxmlLoader.setRoot(this);
      fxmlLoader.setController(this);
      fxmlLoader.load();
      String[] spilletedUserName =  splitUserName(resUser.getUserName());
      setLabelsTextValues(spilletedUserName[0], spilletedUserName[1]);
      styleComponent(resUser);
    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }

  private void styleComponent(ResUser resUser) {
    setStyle("-fx-background-color:" + resUser.getResUserType().getBottomColor() + ";");
    setHover(true);
    setOnMouseEntered(new EventHandler<Event>() {
      @Override
      public void handle(Event event) {
        setStyle("-fx-background-color:" + resUser.getResUserType().getTopColor() + ";");
      }});
    
      setOnMouseExited(new EventHandler<Event>() {
        @Override
        public void handle(Event event) {
          setStyle("-fx-background-color:" + resUser.getResUserType().getBottomColor() + ";");
        }});
    
      firstNameLabel.setTextAlignment(TextAlignment.RIGHT);
      lastNameLabel.setTextAlignment(TextAlignment.RIGHT);
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
  
  //TODO check on index out of bound array
  private String[] splitUserName(String userName) {
    String[] splittedArray = userName.split("\\s");
    String firstName = splittedArray[0];
    String lastName = splittedArray[1];
//    String firstName = "";
//    String lastName = "";
//    int indexOfFirstSpace = userName.indexOf("\\s");
//
//    if (indexOfFirstSpace != -1) {
//      firstName = userName.substring(0, indexOfFirstSpace);
//      lastName = userName.substring(indexOfFirstSpace, userName.length() - 1);
//    } else {
//      firstName = userName;
//    }
    return new String[] {firstName, lastName};

  }
}
