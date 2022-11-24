package com.example.laba;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class LibraryController extends Controller {

	@FXML
	private Button back;
	@FXML
	private Button exit;
	@FXML
	private Button add_book;
	@FXML
	private Button open_archive;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		back.setOnAction(action -> {
			setScene("autorization");
		});
		exit.setOnAction(action -> {
			exit();
		});
		add_book.setOnAction(action -> {
			setScene("add_book");
		});
		open_archive.setOnAction(action -> {
			setScene("enter_in_achive");
		});
	}

}
