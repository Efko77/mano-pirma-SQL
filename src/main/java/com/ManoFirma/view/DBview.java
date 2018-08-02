package com.ManoFirma.view;

import com.ManoFirma.model.DBSingleton;

import java.util.Scanner;

public class DBview {
    public void dirbam() {
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        String uzklausa = " ";
        while (arTesti) {
            showMenu();
            int pasirinkimas = sc.nextInt();
            switch (pasirinkimas) {

                case 0:
                    arTesti = false;
                    break;
                case 1:
                    uzklausa = "SELECT * FROM `studens` ORDER BY `name` ASC;";
                    DBSingleton.getInstance().printQueryResult(uzklausa);
                    break;
                case 2:
                    uzklausa = "SELECT * FROM `studens` WHERE `name` LIKE '%as' AND `surname` LIKE '%as' ORDER BY `surname` ASC;";
                    DBSingleton.getInstance().printQueryResult(uzklausa);
                    break;
                case 3:
                    uzklausa = "SELECT * FROM `student_address` WHERE `city` LIKE 'Kaunas'";
                    DBSingleton.getInstance().printQueryResult(uzklausa);
                    break;
                case 4:
                    uzklausa = "SELECT * FROM `student_address` WHERE `post_code` IS NOT NULL";
                    DBSingleton.getInstance().printQueryResult(uzklausa);
                    break;
                case 5:
                    uzklausa = "SELECT * FROM `student_marks` ORDER BY `mark` DESC";
                    DBSingleton.getInstance().printQueryResult(uzklausa);
                    break;

            }

        }
    }

    private void showMenu() {
        System.out.println("Iveskite kokia operacija norite atlikti");
        System.out.println("0-baigti darba");
        System.out.println("1- surikiuoti studentus abeceles tvarka");
        System.out.println("2 - studentai kurių vardai ir pavardės baigėsi ‚as‘, surikiuokite rezultatus nuo Z iki A pagal pavardes");
        System.out.println("3 - studentu adresai kurie gyvena Kaune");
        System.out.println("4 -  studentų adresai kuriu pašto kodas ne NULL");
        System.out.println("5 -  studentų pažymius surikiuokite nuo didžiausio iki mažiausio");
    }
}
