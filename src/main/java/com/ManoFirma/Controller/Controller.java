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
        String uzklausa = "SELECT * FROM `student_address` where `city` = 'Kaunas';";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton4(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `student_address` where `post_code` is not null;";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton5(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `student_address` where `post_code` is not null;";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton6(ActionEvent actionEvent) {
        String uzklausa = "UPDATE `student_address` SET `street` = 'Tankas' WHERE `city` IN (\n" +
                "'Kaunas',\n" +
                "'Vilnius',\n" +
                "'Klaipeda'\n" +
                ")";
        DBSingleton.getInstance().updateQueryResult(uzklausa);
        uzklausa = "Select * from student_address;";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton7(ActionEvent actionEvent) { //12 but.
        String uzklausa = "SELECT * FROM `studens` LEFT JOIN `student_address`\n" +
                "ON `studens`.`id` = `student_address`.`student_id` order by `name`";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton8(ActionEvent actionEvent) {
        String uzklausa = "SELECT * FROM `studens` LEFT JOIN `student_marks`\n" +
                "ON `studens`.`id` = `student_marks`.`student_id`ORDER BY `mark`";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton9(ActionEvent actionEvent) {
        String uzklausa = "SELECT *\n" +
                "FROM `studens`\n" +
                "INNER JOIN `student_address` ON `studens`.`id` = `student_address`.`student_id`\n" +
                "INNER JOIN `student_marks` ON `studens`.`id` = `student_marks`.`student_id`\n" +
                "WHERE `city` = 'Kaunas'\n" +
                "ORDER BY `name` LIKE '%as'";
        String atsakymas = DBSingleton.getInstance().printQueryResult(uzklausa);
        isvedimoLaukas.appendText(atsakymas + "\n");
    }

    public void handleButton10(ActionEvent actionEvent) {
    }

    public void handleButton11(ActionEvent actionEvent) {
    }
}
