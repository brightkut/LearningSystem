package Model;

import java.sql.Connection;

import java.sql.DriverManager;


public class SqlConnection {


    public static Connection conn;

    public static Connection DbConnector(){
        try {
            conn = null;
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:course.db");

            return conn;
        }catch (Exception e){
            System.out.println(e);
        }
        return null;


    }

    public static void closeConnect(){
        try {
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }



}
