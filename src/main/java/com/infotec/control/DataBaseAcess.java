package com.infotec.control;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseAcess {


    public static Connection conector(){
        java.sql.Connection conexao = null;

        String driver = "com.mysql.jdbc.Driver";

        String url = "jdbc:mysql://localhost:3306/infotec";
        String user = "root";
        String senha = "123456";


        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, senha);
            return conexao;
        } catch (Exception e) {

            return  null;
        }

    }


}
