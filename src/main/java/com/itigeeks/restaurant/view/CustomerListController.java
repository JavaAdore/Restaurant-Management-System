package com.itigeeks.restaurant.view;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import com.itigeeks.restaurant.view.utils.FXUtilities;

public class CustomerListController extends AnchorPane {

  private RestaurantFacade restaurantFacade;

  @FXML
  private Button nextPageButton;
  @FXML
  private Button previousPageButton;

  @FXML
  private TextField customerSearchTextFeild;

  @FXML
  private Button addNewCustomerButton;

  @FXML
  private TableView customersTableView;

  PagingDetailsHolder pagingDetailsHolder = new PagingDetailsHolder();

  private String[] fieldsToBeDisplayed = {"customerKey", "customerName", "email", "houseName"};

  public CustomerListController() {
    try {

      restaurantFacade = BeanFactory.getBean(RestaurantFacade.class);

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerListView.fxml"));

      fxmlLoader.setRoot(this);

      fxmlLoader.setController(this);

      fxmlLoader.load();

      initializeForm();

    } catch (IOException exception) {
      throw new RuntimeException(exception);
    }
  }

  private void initializeForm() {

    assignListeners();
    initializeCustomerDataTable();
    loadNextCustomersPage();

  }

  private void initializeCustomerDataTable() {

    List<TableColumn> colunms =
        FXUtilities.generateTableColumn(ResCustomer.class, Arrays.asList(fieldsToBeDisplayed));

    TableColumn actionCol = new TableColumn("Action");
    colunms.add(actionCol);

    actionCol.setCellValueFactory(new PropertyValueFactory<>("DUMMY"));

    Callback<TableColumn<Object, String>, TableCell<Object, String>> cellFactory =
        new Callback<TableColumn<Object, String>, TableCell<Object, String>>() {
          @Override
          public TableCell call(final TableColumn<Object, String> param) {
            final TableCell<Object, String> cell = new TableCell<Object, String>() {

              final Button btn = new Button("display");

              @Override
              public void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty) {
                  setGraphic(null);
                  setText(null);
                } else {
                  btn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent arg0) {
                      ResCustomer selectedCustomer =
                          (ResCustomer) getTableView().getItems().get(getIndex());
                      displayCustomerDetailsForm(selectedCustomer);
                    }


                  });
                  setGraphic(btn);
                  setText(null);
                }
              }
            };
            return cell;
          }
        };

    actionCol.setCellFactory(cellFactory);

    customersTableView.getColumns().addAll(colunms);
  }

  private void assignListeners() {

    assignNextPageListener();
    assignPreviousPageListener();
    assignCustomerSearchTextFieldListener();
    assignAddNewCustomerListener();

  }

  private void assignAddNewCustomerListener() {
    addNewCustomerButton.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent arg0) {

        displayCustomerDetailsForm(new ResCustomer());

      }
    });

  }

  private void assignCustomerSearchTextFieldListener() {
    customerSearchTextFeild.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {

        pagingDetailsHolder = new PagingDetailsHolder();

        List<ResCustomer> customers =
            restaurantFacade.loadCustomers(
                new SearchingCriteria(customerSearchTextFeild.getText()), fieldsToBeDisplayed,
                pagingDetailsHolder, PagingDirection.NEXT);

        ObservableList<ResCustomer> data = FXCollections.observableArrayList(customers);

        customersTableView.setItems(data);
      }
    });

  }

  private void assignPreviousPageListener() {
    previousPageButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent arg0) {
        loadPreviousCustomersPage();
      }
    });

  }

  protected void loadNextCustomersPage() {
    loadCustomerPage(PagingDirection.NEXT);

  }

  private void loadCustomerPage(PagingDirection direction) {

    List<ResCustomer> customers =
        restaurantFacade.loadCustomers(new SearchingCriteria(customerSearchTextFeild.getText()),
            fieldsToBeDisplayed, pagingDetailsHolder, direction);

    ObservableList<ResCustomer> data = FXCollections.observableArrayList(customers);

    customersTableView.setItems(data);
  }

  private void assignNextPageListener() {
    nextPageButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent arg0) {
        loadNextCustomersPage();
      }
    });

  }

  protected void loadPreviousCustomersPage() {

    loadCustomerPage(PagingDirection.PREVIOUS);

  }


  private void displayCustomerDetailsForm(ResCustomer selectedCustomer) {

    getChildren().clear();
    getChildren().add(new CustomerDetailsController(selectedCustomer));
  }

}
