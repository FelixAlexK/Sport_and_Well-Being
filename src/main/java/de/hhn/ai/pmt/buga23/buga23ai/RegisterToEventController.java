package de.hhn.ai.pmt.buga23.buga23ai;

import de.hhn.ai.sportwellbeing.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import java.sql.Time;
import java.util.Date;
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

    @FXML
    private Label labelMaxParticipants;

    @FXML
    private Label labelNumberRegistarions;

    @FXML
    public void initialize() {

        try {
            Event event = EventDAO.getEventByORMID(1);
            Place place = PlaceDAO.getPlaceByORMID(1);

            String eventName = event.getEventName();
            labelEventName.setText(eventName);

            PersonSetCollection eventAnimator = event.animator;
            Person[] animator = eventAnimator.toArray();
            labelAnimatorName.setText(String.valueOf(animator[0].getName()));

            labelEventPrice.setText(event.getPrices()[0] / 100 + "€");

            Date eventDate = event.getDate();
            labelEventDate.setText(String.valueOf(eventDate));

            Time eventTime = event.getTime();
            labelEventTime.setText(String.valueOf(eventTime));

            int eventStage = place.getNumber();
            labelStageNumber.setText(String.valueOf(eventStage));

            EventProvider eventOrganizer = event.getEventProvider();
            labelEventProvider.setText(String.valueOf(eventOrganizer.getOrganization()));

            int numberRegistrations = event.getNumberOfRegistrations();
            labelNumberRegistarions.setText(String.valueOf(numberRegistrations));
            int numberMaxRegistrations = event.getMaximumParticipants();
            labelMaxParticipants.setText(String.valueOf(numberMaxRegistrations));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
            try {
            Event event = EventDAO.getEventByORMID(1);
            int numberRegistrations = event.getNumberOfRegistrations();
            int newRegistrations = numberRegistrations+1;
            event.setNumberOfRegistrations(newRegistrations);

            int maxParticipants = event.getMaximumParticipants();
            int newMaxParticipants = maxParticipants-1;
            event.setMaximumParticipants(newMaxParticipants);
            EventDAO.save(event);
            EventDAO.refresh(event);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        else {
            //Open Menu
        }
    }
}
