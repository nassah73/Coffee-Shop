package control; // تأكدي بلي هاد المسار هو اللي عندك [cite: 2025-12-30]

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.util.Duration;

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
    private Button alreadyhave;
    @FXML
    private TextField username;


    @FXML
    void handleLogin(ActionEvent event) {

    }
    public void switchform(ActionEvent e){
        TranslateTransition slider=new TranslateTransition();
        if(e.getSource()==sidecreatacount){
            loginform.setVisible(false);
            slider.setNode(sideform);
            slider.setToX(300);
            slider.setDuration(Duration.seconds(.5));
            slider.setOnFinished((ActionEvent event)->{
                alreadyhave.setVisible(true);
                sidecreatacount.setVisible(false);
                signUpform.setVisible(true);

            });
            slider.play();
        } else if (e.getSource()==alreadyhave) {
            TranslateTransition slide=new TranslateTransition();
            slide.setNode(sideform);
            signUpform.setVisible(false);
            slide.setToX(0);
            slide.setDuration(Duration.seconds(.5));
            slide.setOnFinished((ActionEvent ev)->{
                alreadyhave.setVisible(false);
                sidecreatacount.setVisible(true);
                loginform.setVisible(true);
            });
            slide.play();
        }
    }

    @FXML
    void handleSignUp(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}