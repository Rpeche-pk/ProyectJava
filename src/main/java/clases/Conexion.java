
package clases;
import java.sql.*;
/**
 *
 * @author ROMULO
 */
public class Conexion {
    public static Connection conectar(){
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la base de datos "+ e);
        }
        return (null);
    }
}
