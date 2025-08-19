module com.example.hellofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;
    requires org.apache.pdfbox;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.hellofx to javafx.fxml;
    exports com.example.hellofx;
    exports com.example.hellofx.model;
    exports com.example.hellofx.utils;
    opens com.example.hellofx.model to javafx.fxml;
}