module com.ntd.supermarketmanagement {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ntd.supermarketmanagement to javafx.fxml;
    exports com.ntd.supermarketmanagement;
}
