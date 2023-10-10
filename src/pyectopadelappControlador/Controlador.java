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
import pyectopadelappVista.MenuUsuario;
import pyectopadelappVista.SeleccionPistaYMes;
import pyectopadelappVista.PerfilUsuario;




public class Controlador {
    public static Pistas field = new Pistas();
    public static Users usu = new Users();
    public static AltaUsu newUsu = new AltaUsu();
    public static AltaPista newField = new AltaPista();
    public static AdminPrincipal adminIndex = new AdminPrincipal();
    public static ConfirmacionAlta confirmAlta = new ConfirmacionAlta();
    public static EditPista editField = new EditPista();
    public static EditUsu editUsu = new EditUsu();
    public static ErrorAltaUsuario errorNewUsu = new ErrorAltaUsuario();
    public static Login login = new Login();
    public static MenuUsuario menuUsu = new MenuUsuario();
    public static SeleccionPistaYMes selectFieldMonth = new SeleccionPistaYMes();
    public static PerfilUsuario profileUsu = new PerfilUsuario();
    
    
    //Funcion para iniciar el programa
    public static void start(){
        login.setTitle("Login");
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    //Menu Principal del Admin
    public static void adminMenu(){
        login.setVisible(false);
        adminIndex.setTitle("Centro de administracion");
        adminIndex.setVisible(true);
        adminIndex.setLocationRelativeTo(null);
    }
    //Abrir ventana registrar nuevo usuario
    public static void addUsu(){
        adminIndex.setVisible(false);
        newUsu.setVisible(true);
        newUsu.setTitle("Nuevo usuario");
        newUsu.setLocationRelativeTo(null);
    }
    //Abrir edicion usuario
    public static void editarUsu(){
        adminIndex.setVisible(false);
        editUsu.setVisible(true);
        editUsu.setTitle("Editar usuario");
        editUsu.setLocationRelativeTo(null);
    }
    //Abrir creacion de pista
    public static void addField(){
        adminIndex.setVisible(false);
        newField.setVisible(true);
        newField.setTitle("Añadir pista");
        newField.setLocationRelativeTo(null);
    }
    //Abrir edicion de pista
    public static void editarField(){
        adminIndex.setVisible(false);
        editField.setVisible(true);
        editField.setTitle("Editar pista");
        editField.setLocationRelativeTo(null);
    }
    //Ventana error usuario
    public static void errorCreateUser(){
        newUsu.setVisible(false);
        errorNewUsu.setVisible(true);
        errorNewUsu.setLocationRelativeTo(null);
    }
    //Ventana confirmacion usuario y su codigo:
    public static void confirmationCreateUser(){
        newUsu.setVisible(false);
        confirmAlta.setVisible(true);
        confirmAlta.setLocationRelativeTo(null);
    }
    //Resetear los valores de texto en los campos de añadir usuario
    public static void resetValuesAddUser(){
        newUsu.AltaUsuDNI.setText("");
        newUsu.AltaUsuName.setText("");
        newUsu.AltaUsuSurname.setText("");
        newUsu.AltaUsuMail.setText("");
    }
    //Inicio de de sesion y comprobacion de rol
    public static void login()throws SQLException{
        String dniLogin = login.LogInDNI.getText();
        String codigoLogin = login.LogInPass.getText();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query = "SELECT status, isAdmin FROM users where dni='"+dniLogin+"'AND userCode='"+codigoLogin+"';";
            Statement state= con.createStatement();
            ResultSet result = state.executeQuery(query);
            if(result.next()){
                if (result.getInt("status")==1){
                    if(result.getInt("isAdmin")==1){
                        adminIndex.setTitle("Centro de administracion");
                        login.setVisible(false);
                        adminIndex.setVisible(true);
                        login.LogInDNI.setText("");
                        login.LogInPass.setText("");
                    }else{
                        menuUsu.setTitle("Menu Principal");
                        login.setVisible(false);
                        menuUsu.setVisible(true);
                        login.LogInDNI.setText("");
                        login.LogInPass.setText("");
                    }
                }
            }else{
                System.out.println("Usuario o contraseña incorrecto");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
        }
    }
    // funcion para registrar nuevos usuarios
    public static void createUser() throws SQLException{
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
            String dniBuscar = newUsu.AltaUsuDNI.getText();
            Controlador.generatedUserCod(dniBuscar);
            Controlador.resetValuesAddUser();
           
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
    //Muestra el codigo del usuario registrador
    public static void generatedUserCod(String dniBuscar)throws SQLException{
        confirmAlta.setTitle("Codigo de usuario");
        Controlador.confirmationCreateUser();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query="SELECT userCode FROM users WHERE dni='"+dniBuscar+"';";
            Statement state = con.createStatement();
            ResultSet result = state.executeQuery(query);
            int codigoUser = result.getInt("userCode");
            confirmAlta.uCode.setText(""+codigoUser);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
        }
    }
    //Volver al inicio
    public static void volverConfirmarUser() throws SQLException{
        confirmAlta.uCode.setText("");
        adminIndex.setTitle("Centro de administracion");
        confirmAlta.setVisible(false);
        adminIndex.setVisible(true);
    }
    //Crear pista
    public static void createField()throws SQLException{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            field.setCodPista(Integer.parseInt(newField.IDNuevaPista.getText()));
            if (newField.NuevaPistaReady.isSelected()){
                String query = "INSERT INTO fields (field_code, status) VALUES (?,?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setInt(1, field.getCodPista());
                consulta.setInt(2, 1 );
            }else{
                String query = "INSERT INTO fields (field_code, status) VALUES (?,?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setInt(1, field.getCodPista());
                consulta.setInt(2, 0 );
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
}
