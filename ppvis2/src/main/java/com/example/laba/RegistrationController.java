package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class RegistrationController extends Controller {

	@FXML
	private Button create;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		create.setOnAction(action -> {
			setScene("library");
		});
	}

}
