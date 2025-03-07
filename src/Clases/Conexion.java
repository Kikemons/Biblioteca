
package Clases;

import java.sql.*;

/**
 *
 * @author monsalve
 */
public class Conexion {
    //Conexión Local

    public static Connection conectar(){
        try {
            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?useSSL=false","root","admin");
            return cn;
        } catch (SQLException e) {
            System.err.println("error de administrador, no se pudo hacer conexion con la base de datos: "+e);
        }
        return null;
    }
}
