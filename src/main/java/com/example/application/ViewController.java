package com.example.application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Yay! You clicked me!");
    }
}