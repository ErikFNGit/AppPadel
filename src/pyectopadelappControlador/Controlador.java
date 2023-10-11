package pyectopadelappControlador;

import java.awt.Component;
import java.awt.Container;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;
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
import pyectopadelappVista.listaUsers;




public class Controlador {
    public static Pistas field = new Pistas();
    public static Users usu = new Users();
    public static AltaUsu newUsu = new AltaUsu();
    public static AltaPista newField = new AltaPista();
    public static AdminPrincipal adminIndex = new AdminPrincipal();
    public static ConfirmacionAlta confirmAlta = new ConfirmacionAlta();
    public static EditPista editField = new EditPista();
    public static EditUsu edUsu = new EditUsu();
    public static ErrorAltaUsuario errorNewUsu = new ErrorAltaUsuario();
    public static Login login = new Login();
    public static MenuUsuario menuUsu = new MenuUsuario();
    public static SeleccionPistaYMes selectFieldMonth = new SeleccionPistaYMes();
    public static PerfilUsuario profileUsu = new PerfilUsuario();
    public static listaUsers listUsu = new listaUsers();
    
    
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
    //Abrir listado de usuarios para posterior edicion
    public static void listaDeUsers(){
        adminIndex.setVisible(false);
        listUsu.setVisible(true);
        listUsu.setTitle("Editar usuario");
        listUsu.setLocationRelativeTo(null);
    }
    //Abrir edicion usuario
    public static void editarUsu(){
        listUsu.setVisible(false);
        edUsu.setVisible(true);
        edUsu.setTitle("Editar usuario");
        edUsu.setLocationRelativeTo(null);
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
    public static void login()throws SQLException, ClassNotFoundException{
        String dniLogin = login.LogInDNI.getText();
        String codigoLogin = login.LogInPass.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
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
            consulta.setInt(5, 1);
            
            int addedRows = consulta.executeUpdate();
            System.out.println("Añadidas correctamente: "+addedRows);
            //Aqui hay que añadir para que inicie el controlador, para que resetee
            //los values y se esconda la ventana y salga la de confirmacion de alta
            String dniBuscar = newUsu.AltaUsuDNI.getText();
            System.out.println(dniBuscar);
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
            System.out.println(dniBuscar);
            Statement state = con.createStatement();
            ResultSet result = state.executeQuery(query);
            if (result.next()){
                int codigoUser = result.getInt("userCode");
                confirmAlta.uCode.setText(""+codigoUser);
            }else{
                System.out.println("No se ha encontrado registros para el dni: " + dniBuscar);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"No se ha podido mostrar el codigo en la conexion a la base de datos"+ex.getMessage());
        }
    }
    //Limpiar todos los campos
    public static void lmpiarTextFields(Container container){
        Component[] components = container.getComponents();
        for (Component component : components){
            if (component instanceof JTextField){
                ((JTextField)component).setText("");
            }else if(component instanceof JTextArea){
                ((JTextArea)component).setText("");
            }else if(component instanceof JComboBox){
                ((JComboBox<?>)component).setSelectedIndex(0);
            }else if(component instanceof JCheckBox){
                ((JCheckBox)component).setSelected(false);
            }else if(component instanceof Container){
                lmpiarTextFields((Container)component);
            }
        }
    }
    //Volver al inicio
    public static void volverYLimpiarButton(JFrame currentFrame) throws SQLException{
        lmpiarTextFields(currentFrame.getContentPane());
        currentFrame.dispose();
        adminIndex.setTitle("Centro de administracion");
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
                int addedRows = consulta.executeUpdate();
                System.out.println("Añadidas correctamente: "+addedRows);
                Controlador.volverYLimpiarButton(newField);
            }else{
                String query = "INSERT INTO fields (field_code, status) VALUES (?,?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setInt(1, field.getCodPista());
                consulta.setInt(2, 0 );
                int addedRows = consulta.executeUpdate();
                System.out.println("Añadidas correctamente: "+addedRows);
                Controlador.volverYLimpiarButton(newField);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
    //Lista de usuarios
    public static void listUsers(){
        try{
            Controlador.listaDeUsers();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "SELECT userCode, name, surname FROM users";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                String userCode = result.getString("userCode");
                String name = result.getString("name");
                String surname = result.getString("surname");
                listUsu.listaUsuarios.append("Codigo: "+userCode+"\n");
                listUsu.listaUsuarios.append("Nombre: "+name+"\n");
                listUsu.listaUsuarios.append("Apellido: "+surname+"\n");                
                listUsu.listaUsuarios.append("~~~~~~~~~~~~\n");
                System.out.println(userCode);
                System.out.println(name);
                System.out.println(surname);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
    //Buscar el usuario a editar
    public static void cargarDatosEditar(){
        Controlador.editarUsu();
        listUsu.searchUsers.setText("");
        try{
            edUsu.buttonGroupEditar.add(edUsu.AmonestadoCheck);
            edUsu.buttonGroupEditar.add(edUsu.CorrectoCheck);
            usu.setUserCode(Integer.parseInt(listUsu.searchUsers.getText()));
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "SELECT userCode, name, surname, mail, status FROM users WHERE userCode='"+usu.getUserCode()+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            if(result.next()){
                String userCode = result.getString("userCode");
                String name = result.getString("name");
                String surname = result.getString("surname");
                String mail = result.getString("mail");
                int status = result.getInt("status");
                edUsu.EditUsuDNI.setText(userCode);
                edUsu.EditUsuName.setText(name);
                edUsu.EditUsuSurname.setText(surname);  
                edUsu.EditUsuMail.setText(mail); 
                if (status == 1){
                    edUsu.AmonestadoCheck.setSelected(true);
                    edUsu.CorrectoCheck.setSelected(false);
                }else if (status == 0){
                    edUsu.AmonestadoCheck.setSelected(false);
                    edUsu.CorrectoCheck.setSelected(true);
                }

            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
    public static void guardarEdicionUsu(){
        usu.setUserCode(Integer.parseInt(edUsu.EditUsuDNI.getText()));
        usu.setUserName(edUsu.EditUsuName.getText());
        usu.setUserSurname(edUsu.EditUsuName.getText());
        usu.setUserMail(edUsu.EditUsuMail.getText());
        if (edUsu.AmonestadoCheck.isSelected()){
            usu.setUserStatus(0);
        }else if (edUsu.CorrectoCheck.isSelected()){
            usu.setUserStatus(1);
        }
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "UPDATE users SET name=?, surname=?, mail=?, status=? WHERE userCode='"+usu.getUserCode()+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            consulta.setString(1,usu.getUserName());
            consulta.setString(2,usu.getUserSurname());
            consulta.setString(3,usu.getUserMail());
            consulta.setInt(4,usu.getUserStatus());
            int insertedRows=consulta.executeUpdate();
            System.out.println("Actualizaciones: "+insertedRows);
            Controlador.volverYLimpiarButton(edUsu);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            errorNewUsu.setTitle("ERROR");
            Controlador.errorCreateUser();
        }
    }
}