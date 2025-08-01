package Clases;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author monsalve
 */
public class Conexion {
    //Conexión Local

    public static Connection conectar() {
        try { 
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca?useSSL=false&allowPublicKeyRetrieval=true",
                    "root",
                    "admin"
            );

            return cn;
        } catch (SQLException e) {
            System.err.println("error de administrador, no se pudo hacer conexion con la base de datos: " + e);
            JOptionPane.showMessageDialog(null, "Error al conectar con la base datos, verifica la conexion");
        }
        return null;
    }
}
