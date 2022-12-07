package de.hhn.ai.pmt.buga23.buga23ai;

/**
 * Sample Skeleton for 'login.fxml' Controller Class
 */

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    public void initialize() {

    }
    @FXML
    private Label welcomeText;
    @FXML // fx:id="login_headerLabel"
    private Label login_headerLabel; // Value injected by FXMLLoader

    @FXML // fx:id="username_textField"
    private TextField username_textField; // Value injected by FXMLLoader

    @FXML // fx:id="login_button"
    private Button login_button; // Value injected by FXMLLoader

    @FXML // fx:id="register_link"
    private Hyperlink register_link; // Value injected by FXMLLoader

    @FXML // fx:id="password_textField"
    private TextField password_textField; // Value injected by FXMLLoader

    public void onHelloButtonClick(ActionEvent actionEvent) {
    }
}
