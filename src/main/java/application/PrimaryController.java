package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PrimaryController {

    private int n = 0;

    @FXML
    private Button button1;

    @FXML
    private Label label1;

    @FXML
    protected void onClick(ActionEvent event) {
        n++;
        label1.setText("Нажато раз: " + n);
    }
}
