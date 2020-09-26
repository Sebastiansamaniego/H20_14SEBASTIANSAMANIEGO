package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conexion {

    protected static Connection conexion = null;
    public static Connection cnx = null;

    public static Connection conectar() throws Exception {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnx = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName= PizzaHUT", "sa", "123456");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);
        }
        return cnx;
    }

    public static void desconectar() throws Exception {
        if (Conexion.cnx != null) {
            cnx.close();
        }
    }

    public static void main(String[] args)throws Exception  {
        conectar();
        if(cnx!=null){
            System.out.println("listo");
        }
        else{System.out.println("nooo");}
    }
}
