package com.example.application;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import util.Alerts;
import util.Constraints;

import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {

    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    @FXML
    private Label labelResult;

    @FXML
    protected void onBtnSumClick() {
        Locale.setDefault(Locale.US);

        try {
            double number1 = Double.parseDouble(txtNum1.getText());
            double number2 = Double.parseDouble(txtNum2.getText());
            double result = number1 + number2;

            labelResult.setText(String.valueOf(result));
        }
        catch (NumberFormatException e) {
            Alerts.showAlert("Error", null, e.getMessage(), Alert.AlertType.ERROR);
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Constraints.setTextFieldDouble(txtNum1);
        Constraints.setTextFieldDouble(txtNum2);
        Constraints.setTextFieldMaxLength(txtNum1, 6);
        Constraints.setTextFieldMaxLength(txtNum2, 6);
    }
}
