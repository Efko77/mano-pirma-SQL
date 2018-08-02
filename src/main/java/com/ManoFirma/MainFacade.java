package com.ManoFirma;



import com.ManoFirma.view.DBview;

public class MainFacade {
    public static void main (String[]args){
        //DBSingleton.getInstance().printQueryResult("SELECT * FROM `user`: ");
        DBview objektas = new DBview();
        objektas.dirbam();

    }
}
