package com.example.application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerts;

import java.util.Locale;

public class CalculatorController {

    @FXML
    private TextField txtFirstNum;

    @FXML
    private TextField txtSecNum;

    @FXML
    private Label labelResult;

    @FXML
    protected void onBtnSumClick() {
        Locale.setDefault(Locale.US);

        try {
            double number1 = Double.parseDouble(txtFirstNum.getText());
            double number2 = Double.parseDouble(txtSecNum.getText());
            double result = number1 + number2;

            labelResult.setText(String.valueOf(result));
        }
        catch (NumberFormatException e) {
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}
