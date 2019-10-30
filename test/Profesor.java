
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Profesor {

    public static void main(String[] args) {
        // con es la conexion
        Connection con = null;
        // Statement hace la llama a la base de datos
        Statement stn = null;
        // ResultSet es la respuesta al Statement
        ResultSet respuesta = null;

        String user = "root";
        String password = "";

        String url = "jdbc:mysql://localhost:3306/maniaticasdb?" + user + "&password=" + password;

        // try es intentar, sino podes anda al catch
        // catch es decime porque no pudiste
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url);

            System.out.println("Conectado");

            stn = con.createStatement();

            // el select es la 
            String sql = "Select * from productos";

            // El query es la instruccion
            respuesta = stn.executeQuery(sql);

            System.err.println(respuesta);

            while (respuesta.next()) {
                System.out.println(respuesta.getString("nombre"));
            }

        } catch (ClassNotFoundException error) {
            System.out.println("No se conecto a la clase " + error);
        } catch (SQLException error) {
            System.out.println("No se conecto a la base de datos " + error);
        }
    }
}
