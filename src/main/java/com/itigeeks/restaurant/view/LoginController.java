package com.itigeeks.restaurant.view;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

@Controller
public class LoginController extends Pane {

	@Autowired
	private RestaurantFacade restaurantFacade;
	
	@Autowired
	private ApplicationContext applicationContext;
	
	@FXML
	private Button myButton;

	public LoginController() throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
				"login.fxml"));

		fxmlLoader.setRoot(this);
		fxmlLoader.setController(this);
		try {
			fxmlLoader.load();
		} catch (IOException exception) {
			throw new RuntimeException(exception);
		}

		assignListeners();
	}

	private void assignListeners() {
		myButton.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				loadNewScene();
			}

		});

	}

	protected void loadNewScene() {
		getChildren().setAll(applicationContext.getBean(Test2Controller.class));

	}

}
