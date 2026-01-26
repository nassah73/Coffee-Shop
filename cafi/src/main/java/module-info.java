module com.example.cafi {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    // هاد السطر هو اللي كان ناقص باش Scene Builder يخدم مزيان [cite: 2025-12-30]
    opens control to javafx.fxml;

    opens com.example.cafi to javafx.fxml;
    exports com.example.cafi;
}