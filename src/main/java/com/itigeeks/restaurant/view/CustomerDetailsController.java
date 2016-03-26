package com.itigeeks.restaurant.view;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.util.Callback;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.common.dto.PagingDetailsHolder;
import com.itigeeks.restaurant.common.dto.SearchingCriteria;
import com.itigeeks.restaurant.common.entity.schema.ResCustomer;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.itigeeks.restaurant.common.utils.BeanFactory;
import com.itigeeks.restaurant.common.utils.Utils;
import com.itigeeks.restaurant.view.utils.FXUtilities;

public class CustomerDetailsController extends AnchorPane {

  @FXML
  private TextField userNameTextField;
  @FXML
  private TextField houseNumberTextField;
  @FXML
  private TextField houseNameTextField;
  @FXML
  private TextField stateTextField;
  @FXML
  private TextField twonTextField;
  @FXML
  private TextField streetTextField;
  @FXML
  private TextField postalCodeTextField;
  @FXML
  private TextField emailTextField;
  @FXML
  private TextField mobileTextField;
  @FXML
  private TextField landLineTextField;
  @FXML
  private TextField countryTextField;

  @FXML
  private AnchorPane voucherAnchorPane;

  private static EventHandler anchorPanesDefaultHandler = null;



  private ResCustomer currentCustomer = null;






  public CustomerDetailsController(ResCustomer regCustomer) {
    try {
      this.currentCustomer = regCustomer;

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ViewCustomer.fxml"));

      fxmlLoader.setRoot(this);

      fxmlLoader.setController(this);

      fxmlLoader.load();

      initializeForm();

    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }


  private void initializeForm() {


    loadCustomerToTextFields(currentCustomer);

    assignListeners();

  }



  private void assignListeners() {
    assignVocherAnchorPaneListener();

  }



  private void assignVocherAnchorPaneListener() {
    EventHandler eventHandler = getDefaultPanesDefaultHandler();
    voucherAnchorPane.setOnTouchReleased(eventHandler);
    voucherAnchorPane.setOnMouseClicked(eventHandler);
    voucherAnchorPane.setOnKeyReleased(eventHandler);

  }

  public EventHandler getDefaultPanesDefaultHandler() {
    if (anchorPanesDefaultHandler == null) {
      anchorPanesDefaultHandler = new EventHandler() {
        @Override
        public void handle(Event event) {
          AnchorPane anchorPane = (AnchorPane) event.getSource();
          if (anchorPane == voucherAnchorPane) {
            displayVocherForm();
          }
        }
      };
    }
    return anchorPanesDefaultHandler;
  }



  protected void displayVocherForm() {
    
    getChildren().clear();
    getChildren().add(new CustomerVouchersController(currentCustomer));

  }



  private void loadCustomerToTextFields(ResCustomer currentCustomer) {
    if (currentCustomer != null) {
      userNameTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getCustomerName()));

      houseNumberTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getHouseNo()));

      houseNameTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getHouseName()));

      streetTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getStreet()));

      if (Utils.isNotNull(currentCustomer.getResCity())) {
        twonTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getResCity()
            .getCityName()));
      }

      if (Utils.isNotNull(currentCustomer.getResState())) {
        stateTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getResState()
            .getStateName()));
      }

      postalCodeTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getPostCode()));

      if (Utils.isNotNull(currentCustomer.getResCountry())) {
        countryTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getResCountry()
            .getCountryName()));
      }

      emailTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getEmail()));

      landLineTextField.setText(Utils.getAbsoluteStringValue(currentCustomer.getLandLine()));

    }

  }



}
