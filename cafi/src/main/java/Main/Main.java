package Main; // تأكدي بلي هاد الباكيج صحيح

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // المسار الصحيح بناءً على صورك هو /view/login.fxml
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/view/login.fxml"));

        // قياس الواجهة (تقدري تبدليه على حسب التصميم ديالك)
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Coffee Shop - Login Account");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}