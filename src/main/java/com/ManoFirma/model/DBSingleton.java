package com.ManoFirma.model;

public class DBSingleton {
    private static DBSingleton instance = null;

    public static DBSingleton getInstance (){
        if (instance==null){
            instance=new DBSingleton();
        }
        return instance;
    }
}
