package com.example.laba;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;


public abstract class Controller implements Initializable {

	private Application application;

	protected final void setScene(String name) {
		application.setScene(name);
	}

	protected final void exit() {
		application.exit();
	}
	
	public static Scene load(String name, Application application) {
		name = "/" + name + ".fxml";
		FXMLLoader loader = new FXMLLoader();
		URL xmlUrl = Application.class.getResource(name);
		loader.setLocation(xmlUrl);
		final Parent root;
		try {
			root = loader.load();
		}catch (Exception e) {
			throw new RuntimeException(name, e);
		}
		
		final var controller = (Controller) loader.getController();
		controller.application = application;
		
		return new Scene(root);
	}
	
}
