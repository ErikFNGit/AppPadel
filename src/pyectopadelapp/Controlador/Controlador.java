/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pyectopadelapp.Controlador;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Controlador {
    public static void conectar()throws SQLException{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            JOptionPane.showMessageDialog(null,"Se ha podido establecer la conexion a la base de datos");
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+e.getMessage());
        }
    }
}
