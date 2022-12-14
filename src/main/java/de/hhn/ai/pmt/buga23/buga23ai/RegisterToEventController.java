package de.hhn.ai.pmt.buga23.buga23ai;

import javafx.fxml.FXML;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import java.util.Optional;

public class RegisterToEventController {

    @FXML
    private Button buttonCancel;

    @FXML
    private Button buttonRegister;

    @FXML
    private Label labelAnimatorName;

    @FXML
    private Label labelEventDate;

    @FXML
    private Label labelEventName;

    @FXML
    private Label labelEventPrice;

    @FXML
    private Label labelEventProvider;

    @FXML
    private Label labelEventTime;

    @FXML
    private Label labelStageNumber;


    public void initialize() {

    }

    @FXML
    protected void onRegisterButtonClick() {
        confirmRegistrationDialog();
    }

    private void confirmRegistrationDialog() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Register to Event");
        alert.setHeaderText("Registration to the Event");
        alert.setContentText("Do you want to register to the event?");

        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK) {
            //Open Menu and increase number of registrations
        }
        else {
            //Open Menu
        }
    }

}
