module cafi { // هنا خاص تكون سمية الـ Artifact اللي في الـ pom.xml
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    // هادو هما اللي كيسمحو لـ JavaFX يقرأ ملفات الـ FXML والـ Styles
    opens Main to javafx.graphics, javafx.fxml;
    opens control to javafx.fxml;

    // بما أن الـ view عندك وسط resources، هاد السطر مهم:
    opens view to javafx.fxml;

    exports Main;
}