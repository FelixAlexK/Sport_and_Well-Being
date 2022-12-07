module de.hhn.ai.pmt.buga23.buga23ai {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.hhn.ai.pmt.buga23.buga23ai to javafx.fxml;
    exports de.hhn.ai.pmt.buga23.buga23ai;
}