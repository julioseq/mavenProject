package Modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by HSEQ on 04/08/2017.
 */
public class Conexion {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://181.143.181.205:3306/seqconsultores_sys";
    private static final String DB_USER = "";
    //private static final String DB_PASSWORD = "seqc";

    private static final String DB_PASSWORD = "";


    public static Connection conection() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        boolean reachable = conn.isValid(10);// 10 sec
        System.out.println(reachable);
        return conn;

    }
}
