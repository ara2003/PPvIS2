package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class AddBooksController extends Controller {

	@FXML
	private Button add;
	@FXML
	private Button back;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		back.setOnAction(action -> {
		    setScene("library");
		});
		add.setOnAction(action -> {
		    setScene("library");
		});
	}

}
