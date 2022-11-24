package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class EnterInArchiveController extends Controller {

	@FXML
	private Button back;
	@FXML
	private Button exit;
	@FXML
	private Button get_book;
	@FXML
	private Button create;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		back.setOnAction(action -> {
			setScene("library");
		});
		exit.setOnAction(action -> {
			exit();
		});
		get_book.setOnAction(action -> {
			setScene("library");
		});
		create.setOnAction(action -> {
			setScene("library");
		});
	}

}
