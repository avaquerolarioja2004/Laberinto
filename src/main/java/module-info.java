module com.iescomercio.mavenproject1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.iescomercio.mavenproject1 to javafx.fxml;
    exports com.iescomercio.mavenproject1;
}
