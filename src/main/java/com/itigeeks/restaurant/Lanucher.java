package com.itigeeks.restaurant;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.view.CustomerListController;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Lanucher extends Application {

	@Autowired
	private RestaurantFacade restaurantFacade;


	@PostConstruct
	public void init() {
	}

	public void test() {
	   
	}

	public static void main(String[] args) {
		SpringApplication.run(Lanucher.class, args);
		launch(args);
	} 

	@Override
	public void start(Stage stage) throws Exception {
	   stage.setScene(new Scene(new CustomerListController()));
	   stage.show();

	}
}
