module com.example.cafi {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires javafx.graphics; // ضرورية باش Stage يخدم [cite: 2025-12-30]

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.sql;

    // هادو هما الساروت ديال المشكل: [cite: 2025-12-30]
    opens Main to javafx.graphics, javafx.fxml;
    opens control to javafx.fxml;
    opens view to javafx.fxml;

//exports com.example.cafi;
    exports Main; // خاصنا نديرو Export للباكيج اللي فيه كلاس المشغل [cite: 2025-12-30]
}