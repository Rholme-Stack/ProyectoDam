/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionSql;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Pc
 */
public class ConexionSQL {
    
    Connection conectar=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/pinguinocrud","root", "");
            //JOptionPane.showMessageDialog(null, "Conexion confirmada!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión!!!" + e.getMessage());
        }
        return conectar;
    }
    
}
