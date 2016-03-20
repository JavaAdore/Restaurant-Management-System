package com.itigeeks.restaurant.view.utils;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.util.Callback;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringFxmlLoader {

	private static final ApplicationContext applicationContext = new AnnotationConfigApplicationContext();

	public void load(URL url, Object root, Object controller)  {

		FXMLLoader loader = new FXMLLoader(url);
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			@Override
			public Object call(Class<?> clazz) {
				return applicationContext.getBean(clazz);
			}
		}); 
		loader.setRoot(root);
		loader.setController(controller);
		try {
			loader.load();
		} catch (IOException e) {
			throw new RuntimeException("not able to load");
		}

	}
}