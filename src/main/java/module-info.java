module org.andrewkozinski.csc325mod5labtipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.andrewkozinski.csc325mod5labtipcalculator to javafx.fxml;
    exports org.andrewkozinski.csc325mod5labtipcalculator;
}