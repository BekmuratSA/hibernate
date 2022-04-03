package org.example.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Db {
    private static final String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String user = "postgres";
    private static final String password = "muslim.kg";

    public static Connection connection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,user,password);
            System.out.println("Database Connected!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
