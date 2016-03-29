package com.itigeeks.restaurant.view;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;


public class Test2Controller extends Pane {

  @Autowired
  private RestaurantFacade restaurantFacade;

  @FXML
  private Button myButton;

  public Test2Controller() {

//    try {
//      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("test2.fxml"));
//      fxmlLoader.setRoot(this);
//      fxmlLoader.setController(this);
//      fxmlLoader.load();
//    } catch (IOException exception) {
//      throw new RuntimeException(exception);
//    }
//
//    assignListeners();
  }

  private void assignListeners() {
    myButton.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent arg0) {
        restaurantFacade.test();
      }

    });

  }

}
