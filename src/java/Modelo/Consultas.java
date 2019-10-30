package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import Clases.Producto;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Consultas extends ConexionDB 
{
    // CODIGO QUE NOS TRAIGA LOS PRODUCTOS Y SUS DESCRIPCIONES DE LA BASE DE DATOS

    public ArrayList traerProductos() throws SQLException, ClassNotFoundException 
    {
        ArrayList<Producto> listaDeProductosDestacados = new ArrayList<>();
        System.out.println("Estoy por Consultas");

        try 
        {
            //Connection (se conecta)
            Connection Conectar = ConexionDB.conectate();
            // STATEMENT (SIRVE PARA CREAR LA CONSULTA)
            Statement ConsultaSQL = Conectar.createStatement();
            ResultSet Resultado = ConsultaSQL.executeQuery("SELECT nombre, precio, idProducto, idImagen from productos ");

            System.out.println(Resultado);
            // hasta acá tenemos todos los listaDeProductosDestacados guardados en Resultado

            while (Resultado.next()) 
            {
                String Nombre = Resultado.getString("nombre");
                int Precio = Resultado.getInt("precio");
                int idImagen = Resultado.getInt("idImagen");

                Producto ProdDestacado = new Producto(Nombre, Precio, idImagen);
                listaDeProductosDestacados.add(ProdDestacado);
            }

        } catch (ClassNotFoundException | SQLException e) 
        {
        }
        return listaDeProductosDestacados;
    }
}
