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
import javafx.scene.layout.AnchorPane;

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
	private TableView customersTableView;

	PagingDetailsHolder pagingDetailsHolder = new PagingDetailsHolder();

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

	}

	private void initializeCustomerDataTable() {
		List<TableColumn> colunms = FXUtilities.generateTableColumn(ResCustomer.class,Arrays.asList(new String[] {  "customerKey","customerName", "email","houseName"}));
		customersTableView.getColumns().addAll(colunms);
	}

	private void assignListeners() {

		assignNextPageListener();
		assignPreviousPageListener();

	}

	private void assignPreviousPageListener() {
		nextPageButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				loadNextCustomersPage();
			}
		});

	}

	protected void loadNextCustomersPage() {
		loadCustomerPage(PagingDirection.NEXT);

	}

	private void loadCustomerPage(PagingDirection direction) {
		List<ResCustomer> customers = restaurantFacade.loadCustomers(
				new SearchingCriteria(customerSearchTextFeild.getText()),
				pagingDetailsHolder, direction);

		ObservableList<ResCustomer> data = FXCollections
				.observableArrayList(customers);

		
		customersTableView.setItems(data);
	}

	private void assignNextPageListener() {
		previousPageButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				loadPreviousCustomersPage();
			}
		});

	}

	protected void loadPreviousCustomersPage() {
		loadCustomerPage(PagingDirection.PREVIOUS);

	}

}
