package com.itigeeks.restaurant.view;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;

import sun.util.resources.LocaleData;
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
import com.itigeeks.restaurant.common.entity.schema.ResVoucher;
import com.itigeeks.restaurant.common.enums.PagingDirection;
import com.itigeeks.restaurant.common.utils.BeanFactory;
import com.itigeeks.restaurant.common.utils.Utils;
import com.itigeeks.restaurant.view.utils.FXUtilities;
import com.sun.javafx.scene.traversal.Direction;
import com.sun.org.apache.xalan.internal.xsltc.dom.LoadDocument;

public class CustomerVouchersController extends AnchorPane {

  private RestaurantFacade restaurantFacade;


  @FXML
  private DatePicker voucherDatePicker;
  @FXML
  private Button lastWeekButton;
  @FXML
  private Button lastMonthButton;
  @FXML
  private Button showAllButton;
  @FXML
  private Button nextPageButton;
  @FXML
  private Button previousPageButton;

  @FXML
  private AnchorPane closeAnchorPane;

  @FXML
  private TableView vouchersDataTable;


  private ResCustomer currentCustomer = null;

  private Date startDate;
  private Date endDate;


  PagingDetailsHolder paginDetailsHolder = new PagingDetailsHolder();
  private  EventHandler<ActionEvent> defaultEventHandler = null;



  public CustomerVouchersController(ResCustomer regCustomer) {
    try {
      this.currentCustomer = regCustomer;

      restaurantFacade = BeanFactory.getBean(RestaurantFacade.class);

      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CustomerVouchers.fxml"));

      fxmlLoader.setRoot(this);

      fxmlLoader.setController(this);

      fxmlLoader.load();

      initializeForm();

    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }



  private void initializeForm() {
    initializeVoucherTableView();
    assignListeners();
  }



  private void initializeVoucherTableView() {
    List<TableColumn> tableColumns= FXUtilities.generateTableColumn(ResVoucher.class, new String[] {"voucherNumber", "value",
        "validFrom", "validTill"});

    vouchersDataTable.getColumns().clear();
    vouchersDataTable.getColumns().addAll(tableColumns);
  }



  private void assignListeners() {

    voucherDatePicker.setOnAction(getDefaultFormEventHandler());
    lastWeekButton.setOnAction(getDefaultFormEventHandler());
    lastMonthButton.setOnAction(getDefaultFormEventHandler());
    showAllButton.setOnAction(getDefaultFormEventHandler());
    nextPageButton.setOnAction(getDefaultFormEventHandler());
    previousPageButton.setOnAction(getDefaultFormEventHandler());
    assignCloseButtonListener();



  }

  private void assignCloseButtonListener() {
    EventHandler eventHandler = (new EventHandler() {

      @Override
      public void handle(Event event) {
        loadCustomerDetailsForm();
 
      }
    });

    closeAnchorPane.setOnTouchReleased(eventHandler);
    closeAnchorPane.setOnMouseClicked(eventHandler);
    closeAnchorPane.setOnKeyReleased(eventHandler);
  }

  protected void loadCustomerDetailsForm() {

    getChildren().clear();
    getChildren().add(new CustomerDetailsController(currentCustomer));
  }


  private EventHandler<ActionEvent> getDefaultFormEventHandler() {
    if (defaultEventHandler == null) {
      defaultEventHandler = new EventHandler<ActionEvent>() {

        @Override
        public void handle(ActionEvent event) {

          Object source = event.getSource();
          if (source.equals(voucherDatePicker)) {
            LocalDate localeDate = ((DatePicker) event.getSource()).getValue();
            startDate = FXUtilities.localeDateToDate(localeDate);
             endDate = startDate;
            paginDetailsHolder = new PagingDetailsHolder();
            loadVouchers();

          } else if (source.equals(nextPageButton)) {
            loadNextVoucherPage();
          } else if (source.equals(previousPageButton)) {
            loadPreviousVoucherPage();
          } else if (source.equals(lastMonthButton)) {
            startDate = Utils.getLastMonthFirstDay();
            endDate = Utils.getLastMonthLastDay();
            paginDetailsHolder = new PagingDetailsHolder();
            loadVouchers();
          } else if (source.equals(lastWeekButton)) {
            startDate = Utils.getLastWeekFirstDay();
            endDate = Utils.getLastWeekLastDay();
            paginDetailsHolder = new PagingDetailsHolder();
            loadVouchers();
          } else if (source.equals(showAllButton)) {
            loadAllVouchers();
          }
        }

      };


    }

    return defaultEventHandler;
  }



  protected void loadPreviousVoucherPage() {
    loadVoucherPage(PagingDirection.PREVIOUS);

  }


  protected void loadNextVoucherPage() {
    loadVoucherPage(PagingDirection.NEXT);

  }


  public void loadVouchers() {
    loadVoucherPage(PagingDirection.NEXT);
  }

  private void loadVoucherPage(PagingDirection direction) {

    List<ResVoucher> vouchers =
        restaurantFacade.loadVouchers(currentCustomer, startDate, endDate, paginDetailsHolder,
            direction);

    ObservableList<ResVoucher> data = FXCollections.observableArrayList(vouchers);

    vouchersDataTable.setItems(data);

  }

  private void loadAllVouchers() {
    paginDetailsHolder = new PagingDetailsHolder();
    List<ResVoucher> vouchers =
        restaurantFacade.loadVouchers(currentCustomer, paginDetailsHolder, PagingDirection.NEXT);


    ObservableList<ResVoucher> data = FXCollections.observableArrayList(vouchers);

    vouchersDataTable.setItems(data);
  }


}
