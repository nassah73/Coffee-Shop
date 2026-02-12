package control; // تأكدي بلي هاد المسار هو اللي عندك [cite: 2025-12-30]

import dao.logic;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.util.Duration;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class loginControl implements Initializable {
    @FXML
    private PasswordField su_password;
    @FXML
    private PasswordField su_passwordAgain;
    @FXML
    private TextField su_userName;

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
    private Alert alert;
    public void signUp() throws SQLException {
        if (su_password.getText().isEmpty()|| su_userName.getText().isEmpty()|| su_passwordAgain.getText().isEmpty()){
            alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error message");
            alert.setHeaderText(null);
            alert.setContentText("رجاء املأ جميع الحقول ");
            alert.showAndWait();
        } else if (!su_password.getText().trim().equalsIgnoreCase(su_passwordAgain.getText().trim())) {
            alert=new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error message");
            alert.setHeaderText(null);
            alert.setContentText("كلمات السر غير متطبقتان");
            alert.showAndWait();
        }else{
            alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(" message");
            alert.setHeaderText(null);
            alert.setContentText("every think is ok");
            alert.showAndWait();


            String passValue = su_password.getText().trim();
            String confirmValue = su_passwordAgain.getText().trim();
            String fullUserName = su_userName.getText().trim(); // هنا استعمل su_userName ماشي su_password

            if (!fullUserName.isEmpty()) {
                String[] part = fullUserName.split(" ");
                if (part.length >= 2) {
                    String firstname = part[0];
                    String lastname = part[1];

                    client cl = new client(firstname, lastname, passValue, confirmValue);
                    logic.insert(cl); // دابا هادي غتخدم!

                    System.out.println("✅ tt va bien");
                } else {
                    System.out.println("❌erreur");
                }
            }
            su_password.setText("");
            su_userName.setText("");
            su_passwordAgain.setText("");
        }
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
                su_password.setText("");
                su_userName.setText("");
                su_passwordAgain.setText("");
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