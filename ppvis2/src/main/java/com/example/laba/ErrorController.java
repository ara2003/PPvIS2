package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ErrorController extends Controller {

	@FXML
	private Button back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		back.setOnAction(action -> {
			final var w = (Stage) back.getScene().getWindow();
			w.close();
		});
	}

}
