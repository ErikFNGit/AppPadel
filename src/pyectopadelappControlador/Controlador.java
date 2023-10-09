package pyectopadelappControlador;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;


public class Controlador {
    public static Pistas field = new Pistas();
    public static Users usu = new Users();
    
    
    
    
    public static void conectar()throws SQLException{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            JOptionPane.showMessageDialog(null,"Se ha podido establecer la conexion a la base de datos");
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+e.getMessage());
        }
    }
}
