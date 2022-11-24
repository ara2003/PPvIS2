package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AutorizationController extends Controller {
	
	@FXML
	public Button enter;
	@FXML
	public Button registration;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		enter.setOnAction(action -> {
		    setScene("library");
		});
		registration.setOnAction(action -> {
		    setScene("registration");
		});
	}

}
