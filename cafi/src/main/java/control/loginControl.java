package control; // تأكدي بلي هاد المسار هو اللي عندك [cite: 2025-12-30]

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class loginControl implements Initializable {

    @FXML
    private AnchorPane signUpform, sideform, loginform;

    @FXML
    private PasswordField password;

    @FXML
    private Button loginbtn, sidecreatacount, signUpBtn;

    @FXML
    private TextField username;


    @FXML
    void handleLogin(ActionEvent event) {

    }

    @FXML
    void handleSignUp(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      
    }
}