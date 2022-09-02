package com.example.application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import util.Alerts;

public class ViewController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        // welcomeText.setText("Yay! You clicked me!");
        Alerts.showAlert("Alert", "I'm an alert", "Hello, I'm an alert.", Alert.AlertType.INFORMATION);
        // header can be null
    }
}