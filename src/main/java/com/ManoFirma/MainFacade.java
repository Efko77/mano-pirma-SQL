package com.ManoFirma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainFacade {
    public static void main (String[]args){
        try {
            Class.forName("com.mysql.jdbs.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection=null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://192.168.100.100:3306/mysql", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
