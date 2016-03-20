package com.itigeeks.restaurant;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import com.itigeeks.restaurant.business.facade.RestaurantFacade;
import com.itigeeks.restaurant.view.Test2Controller;
import com.itigeeks.restaurant.view.LoginController;
import com.itigeeks.restaurant.view.utils.SpringFxmlLoader;

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
	    ApplicationContext context = SpringApplication.run(Lanucher.class, "");
	   LoginController testController = context.getBean(LoginController.class);
	   stage.setScene(new Scene(testController));
	   stage.show();
	   

	}
}
