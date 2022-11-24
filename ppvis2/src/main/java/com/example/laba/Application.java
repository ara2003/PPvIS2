package com.example.laba;

import static com.example.laba.Controller.load;

import java.io.IOException;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {
	
	private Stage stage;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		primaryStage.setTitle("Home Library");

		final var scene = load("autorization", this);
		primaryStage.setScene(scene);
		this.stage = primaryStage;
		stage.show();
	}

	public void setScene(Scene scene) {
		this.stage.setScene(scene);
	}
	
	public void setScene(String name) {
		setScene(load(name, this));
	}

	public void exit() {
		System.exit(0);
	}

}
