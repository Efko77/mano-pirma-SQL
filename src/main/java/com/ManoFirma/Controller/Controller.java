package com.ManoFirma.Controller;

import com.ManoFirma.model.DBSingleton;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {
    public Button button1;
    public TextArea isvedimoLaukas;

    public void handleButton1(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `studens` ORDER BY `name` ASC;";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");

    }


    public void handleButton2(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `studens` Where `name` like '%as';";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton3(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `students_address` where order by `city` 'Kaunas';";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton4(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `studens` ORDER BY `name` ASC;";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton5(ActionEvent actionEvent) {
    }

    public void handleButton6(ActionEvent actionEvent) {
    }

    public void handleButton7(ActionEvent actionEvent) {
    }

    public void handleButton8(ActionEvent actionEvent) {
    }

    public void handleButton9(ActionEvent actionEvent) {
    }

    public void handleButton10(ActionEvent actionEvent) {
    }

    public void handleButton11(ActionEvent actionEvent) {
    }
}
