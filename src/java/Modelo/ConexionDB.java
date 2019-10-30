package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    // CODIGO QUE SE CONECTA A LA BASE DE DATOS. nada más     
    
    public static Connection conectate() throws ClassNotFoundException, SQLException {
        Connection dataBaseConnection;
            Class.forName("com.mysql.cj.jdbc.Driver");
            String sourceURL = "jdbc:mysql://localhost:3306/maniticasbd?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            dataBaseConnection = DriverManager.getConnection(sourceURL, "root", "");
            System.out.println("Conectado a la base de datos");        
        return dataBaseConnection;
    }
    
    // EL MAIN ES PARA PROBAR SI LO QUE HICE ESTÁ ANDANDO
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        ConexionDB maniaticas = new ConexionDB();
        maniaticas.conectate();
    }
}
