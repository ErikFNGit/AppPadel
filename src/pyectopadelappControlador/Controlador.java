package pyectopadelappControlador;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;
import pyectopadelappVista.AltaUsu;
import pyectopadelappVista.AltaPista;
import pyectopadelappVista.AdminPrincipal;
import pyectopadelappVista.ConfirmacionAlta;
import pyectopadelappVista.EditPista;
import pyectopadelappVista.EditUsu;
import pyectopadelappVista.ErrorAltaUsuario;
import pyectopadelappVista.Login;
import pyectopadelappVista.SeleccionPistaYMes;
import pyectopadelappVista.PerfilUsuario;



public class Controlador {
    public static Pistas field = new Pistas();
    public static Users usu = new Users();
    public static AltaUsu newUsu = new AltaUsu();
    public static AltaPista newField = new AltaPista();

    
    public static void createUser() throws SQLException{
        newUsu.setTitle("Nuevo usuario");
        usu.setUserDNI(newUsu.AltaUsuDNI.getText());
        usu.setUserName(newUsu.AltaUsuName.getText());
        usu.setUserSurname(newUsu.AltaUsuSurname.getText());
        usu.setUserMail(newUsu.AltaUsuMail.getText());
        usu.setUserStatus(1);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "INSERT INTO users (dni,name,surname,mail,status) VALUES (?,?,?,?,?)";
            PreparedStatement consulta = con.prepareStatement(query);
            consulta.setString(1, usu.getUserDNI());
            consulta.setString(2, usu.getUserName());
            consulta.setString(3, usu.getUserSurname());
            consulta.setString(4, usu.getUserMail());
            consulta.setInt(5, usu.getUserStatus());
            
            int addedRows = consulta.executeUpdate();
            System.out.println("Añadidas correctamente: "+addedRows);
            //Aqui hay que añadir para que inicie el controlador, para que resetee
            //los values y se esconda la ventana y salga la de confirmacion de alta
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
        }
        
    }
    
}
