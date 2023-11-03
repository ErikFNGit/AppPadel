package pyectopadelappControlador;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import pyectopadelappModelo.Pistas;
import pyectopadelappModelo.Users;
import pyectopadelappModelo.Bookings;
import pyectopadelappVista.AltaUsu;
import pyectopadelappVista.AltaPista;
import pyectopadelappVista.AdminPrincipal;
import pyectopadelappVista.ConfirmacionAlta;
import pyectopadelappVista.EditPista;
import pyectopadelappVista.EditUsu;
import pyectopadelappVista.EditUsuPubli;
import pyectopadelappVista.Login;
import pyectopadelappVista.MenuUsuario;
import pyectopadelappVista.SeleccionPistaYMes;
import pyectopadelappVista.PerfilUsuario;
import pyectopadelappVista.listaUsers;
import pyectopadelappVista.cambiarPass;
import pyectopadelappVista.DatosReserva;
import pyectopadelappVista.ListaDeReservas;

public class Controlador {
    public static Pistas field = new Pistas();
    public static Users usu = new Users();
    public static Bookings reserva = new Bookings();
    public static AltaUsu newUsu = new AltaUsu();
    public static AltaPista newField = new AltaPista();
    public static AdminPrincipal adminIndex = new AdminPrincipal();
    public static ConfirmacionAlta confirmAlta = new ConfirmacionAlta();
    public static EditPista editField = new EditPista();
    public static EditUsu edUsu = new EditUsu();
    public static EditUsuPubli edUsuPubli = new EditUsuPubli();
    public static Login login = new Login();
    public static MenuUsuario menuUsu = new MenuUsuario();
    public static SeleccionPistaYMes selectFieldMonth = new SeleccionPistaYMes();
    public static PerfilUsuario profileUsu = new PerfilUsuario();
    public static listaUsers listUsu = new listaUsers();
    public static cambiarPass changePass = new cambiarPass();
    public static DatosReserva datosReserva = new DatosReserva();
    public static ListaDeReservas listaBookings = new ListaDeReservas();
    
    
    //Funcion para iniciar el programa
    public static void start(){
        login.setTitle("Login");
        login.setVisible(true);
        login.errorUsuPassLabel.setVisible(false);
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
        newUsu.errorAltaUser.setVisible(false);
        newUsu.errorDniNie.setVisible(false);
        newUsu.setLocationRelativeTo(null);
    }
    //Abrir listado de usuarios para posterior edicion
    public static void listaDeUsers(){
        adminIndex.setVisible(false);
        listUsu.setVisible(true);
        listUsu.setTitle("Editar usuario");
        listUsu.setLocationRelativeTo(null);
    }
    //Abrir listado de reservas
    public static void listadoDeReservas(){
        profileUsu.setVisible(false);
        listaBookings.setVisible(true);
        listaBookings.setTitle("Mis reservas");
        listaBookings.setLocationRelativeTo(null);
    }
    //Abrir edicion usuario
    public static void editarUsuPubli(){
        profileUsu.setVisible(false);
        edUsuPubli.setVisible(true);
        edUsuPubli.setTitle("Editar datos");
        edUsuPubli.setLocationRelativeTo(null);
    }
    //Abrir edicion usuario desde la parte de usuario
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
        newField.IDNuevaPista.setEditable(false);
        try {
            Controlador.newFieldCode();
        } catch (SQLException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Abrir edicion de pista
    public static void editarField(){
        adminIndex.setVisible(false);
        editField.setVisible(true);
        editField.setTitle("Editar pista");
        editField.setLocationRelativeTo(null);
    }
    //Perfil de usuario
    public static void abrirPerfilUsu(){
        menuUsu.setVisible(false);
        profileUsu.setVisible(true);
        profileUsu.setTitle("Mi perfil");
        profileUsu.setLocationRelativeTo(null);
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
    //Abrir cambio de pass
    public static void openChangePass(){
        edUsuPubli.setVisible(false);
        changePass.setVisible(true);
        changePass.setTitle("Cambiar contraseña");
        changePass.errorCheckPass.setVisible(false);
        changePass.errorNewPass.setVisible(false);
        changePass.setLocationRelativeTo(null);
    }
    //Atras cambiar pass
    public static void atrasChangePass(){
        changePass.setVisible(false);
        edUsuPubli.setVisible(true);
        edUsuPubli.setTitle("Editar Datos");
        edUsuPubli.setLocationRelativeTo(null);
    }
    //Abrir creacion reserva
    public static void abrirReserva(){
        menuUsu.setVisible(false);
        selectFieldMonth.calendarioPistas.setWeekOfYearVisible(false);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        selectFieldMonth.calendarioPistas.setMinSelectableDate(calendar.getTime());
        selectFieldMonth.noPistas.setVisible(false);
        selectFieldMonth.setTitle("Reservas");
        selectFieldMonth.setVisible(true);
        selectFieldMonth.setLocationRelativeTo(null);
    }
    //Abrir reserva post Creacion
    public static void abrirDatosReserva()throws SQLException{
        selectFieldMonth.setVisible(false);
        datosReserva.setTitle("Mi reserva");
        datosReserva.setVisible(true);
        datosReserva.idReservaTxt.setEditable(false);
        datosReserva.diaReservaTxt.setEditable(false);
        datosReserva.horaInicioReservaTxt.setEditable(false);
        datosReserva.horaFinReservaTxt.setEditable(false);
        datosReserva.idPistaReservaTxt.setEditable(false);
        datosReserva.setLocationRelativeTo(null);
        try{
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query = "SELECT booking_cod, fecha, sHour, eHour, fNum FROM bookings WHERE userDNI = "+usu.getUserDNI()+" ORDER BY booking_cod DESC LIMIT 1;";
            Statement state= con.createStatement();
            ResultSet result = state.executeQuery(query); 
            if(result.next()){
                datosReserva.idReservaTxt.setText(result.getString("booking_cod"));
                datosReserva.diaReservaTxt.setText(result.getString("fecha"));
                datosReserva.horaInicioReservaTxt.setText(result.getString("sHour"));
                datosReserva.horaFinReservaTxt.setText(result.getString("eHour"));
                datosReserva.idPistaReservaTxt.setText(result.getString( "fNum"));
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage()); 
        }
    }
    //Inicio de de sesion y comprobacion de rol
    public static void login()throws SQLException, ClassNotFoundException{
        String dniLogin = login.LogInDNI.getText();
        String passLogin = login.LogInPass.getText();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query = "SELECT status, isAdmin, userCode, dni FROM users where dni='"+dniLogin+"'AND userPass='"+passLogin+"';";
            Statement state= con.createStatement();
            ResultSet result = state.executeQuery(query);
            if(result.next()){
                if (result.getInt("status")==1){
                    usu.setUserPass(passLogin);
                    if(result.getInt("isAdmin")==1){
                        usu.setIsAdmin(1);
                        //usu.setUserCode(result.getInt("userCode"));
                        adminIndex.setTitle("Centro de administracion");
                        login.setVisible(false);
                        adminIndex.setVisible(true);
                        login.LogInDNI.setText("");
                        login.LogInPass.setText("");
                    }else{
                        usu.setIsAdmin(0);
                        usu.setUserCode(result.getInt("userCode"));
                        usu.setUserDNI(result.getString("dni"));
                        menuUsu.setTitle("Menu Principal");
                        login.setVisible(false);
                        menuUsu.setVisible(true);
                        login.LogInDNI.setText("");
                        login.LogInPass.setText("");
                    }
                }
            }else{
                login.LogInDNI.setText("");
                login.LogInPass.setText("");
                login.errorUsuPassLabel.setVisible(true);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
        }
    }
    //Funcion calcular numero dni
    public static char calcLetraDni(int digitos){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = digitos % 23;
        return letras.charAt(indice);
    }
    //Funcion validacion de DNI
    public static boolean validarDNI(String dni){
        if (dni.length()!=9){
            return false;
        }
        String digitos = dni.substring(0,8);
        char letraVerificacion = dni.charAt(8);
        char letraEsperada= calcLetraDni(Integer.parseInt(digitos));
        if (letraVerificacion == letraEsperada){
            return true;
        }else{
            return false;
        }
   
    }
    //Funcion calcular letra NIE
    public static char calcLetraNIE(char letraInicial, int digitos){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int indice = digitos % 23;
        
        if (letraInicial == 'Y'){
            indice += 10000000;
        }else if (letraInicial == 'Z'){
            indice += 20000000;
        }
        return letras.charAt(indice);
    }
    //Funcion validar NIE
    public static boolean validarNIE(String nie){
        if (nie.length() != 9){
            return false;
        }
        char letraInicial = nie.charAt(0);
        if (letraInicial != 'X' && letraInicial != 'Y' && letraInicial != 'Z'){
            return false;
        }
        String digitos = nie.substring(1,8);
        char letraVerificacion = nie.charAt(8);
        char letraEsperada = calcLetraNIE(letraInicial, Integer.parseInt(digitos));
        if (letraVerificacion == letraEsperada){
            return true;
        }else{
            return false;
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
            //if (validarDNI(usu.getUserDNI())== true){
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
                String query= "INSERT INTO users (dni,name,surname,mail,usserPass, status) VALUES (?,?,?,?,?,?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setString(1, usu.getUserDNI());
                consulta.setString(2, usu.getUserName());
                consulta.setString(3, usu.getUserSurname());
                consulta.setString(4, usu.getUserMail());
                consulta.setString(5, usu.getUserDNI());
                consulta.setInt(6, 1);
                int addedRows = consulta.executeUpdate();
                System.out.println("Añadidas correctamente: "+addedRows);
                //Aqui hay que añadir para que inicie el controlador, para que resetee
                //los values y se esconda la ventana y salga la de confirmacion de alta
                String dniBuscar = newUsu.AltaUsuDNI.getText();
                System.out.println(dniBuscar);
                confirmAlta.uCode.setHorizontalAlignment(JTextField.CENTER);
                Controlador.generatedUserCod(dniBuscar);
                Controlador.resetValuesAddUser();
            /*}else if(validarNIE(usu.getUserDNI())== true){
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
                confirmAlta.uCode.setHorizontalAlignment(JTextField.CENTER);
                Controlador.generatedUserCod(dniBuscar);
                Controlador.resetValuesAddUser(); 
            }else{
                    newUsu.errorDniNie.setVisible(true);
                    newUsu.AltaUsuDNI.setText("");
            }*/
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());
            newUsu.errorAltaUser.setVisible(true);
            newUsu.AltaUsuDNI.setText("");
            newUsu.AltaUsuMail.setText("");
            
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
    //Mostrara el codigo de la nueva pista a genrar
    public static void newFieldCode()throws SQLException{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query="SELECT MAX(field_code) AS field_code FROM fields;";
            Statement state = con.createStatement();
            ResultSet result = state.executeQuery(query);
            if (result.next()){
                int codigoFields = result.getInt("field_code");
                newField.IDNuevaPista.setText(""+(codigoFields+1));
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getMessage());
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
        if (usu.getIsAdmin()==1){
            adminIndex.setTitle("Centro de administracion");
            adminIndex.setVisible(true);
        }else if (usu.getIsAdmin()==0){
            menuUsu.setTitle("Menu principal");
            menuUsu.setVisible(true);
        }
    }
    //Crear pista
    public static void createField()throws SQLException{
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            field.setCodPista(Integer.parseInt(newField.IDNuevaPista.getText()));
            if (newField.NuevaPistaReady.isSelected()){
                String query = "INSERT INTO fields (status) VALUES (?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setInt(1, 1 );
                int addedRows = consulta.executeUpdate();
                System.out.println("Añadidas correctamente: "+addedRows);
                Controlador.volverYLimpiarButton(newField);
            }else{
                String query = "INSERT INTO fields (status) VALUES (?)";
                PreparedStatement consulta = con.prepareStatement(query);
                consulta.setInt(1, 0 );
                int addedRows = consulta.executeUpdate();
                System.out.println("Añadidas correctamente: "+addedRows);
                Controlador.volverYLimpiarButton(newField);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
    }
    //Lista de usuarios
    public static void listUsers()throws SQLException{
        try{
            ArrayList<String> datosList = new ArrayList<>();
            Controlador.listaDeUsers();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "SELECT userCode, name, surname FROM users";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            listUsu.listaUsus.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listUsu.listaUsus.setLayoutOrientation(JList.VERTICAL);
            while(result.next()){
                String userCode = result.getString("userCode");
                String name = result.getString("name");
                String surname = result.getString("surname");
                String datos = name+" "+surname+" "+userCode;
                datosList.add(datos);
            }
            String[] datos = datosList.toArray(new String [datosList.size()]);
            listUsu.listaUsus.setListData(datos);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
    }
    //Lista de reservas
    public static void listReservas()throws SQLException{
        try{    
            ArrayList<String> datosReservas = new ArrayList<>();
            Controlador.listadoDeReservas();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "SELECT booking_cod, fecha, sHour, eHour, fNum FROM bookings WHERE userDNI = '"+usu.getUserDNI()+"'";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            listUsu.listaUsus.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            listUsu.listaUsus.setLayoutOrientation(JList.VERTICAL);
            while(result.next()){
                String booking_cod = result.getString("booking_cod");
                String fecha = result.getString("fecha");
                String sHour = result.getString("sHour");
                String eHour = result.getString("eHour");
                String fNum = result.getString("fNum");
                String datos = booking_cod+" "+fecha+" "+sHour+" "+eHour+" "+fNum;
                datosReservas.add(datos);
            }
            String[] datos = datosReservas.toArray(new String [datosReservas.size()]);
            listaBookings.listBookings.setListData(datos);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
    }
    //Buscar el usuario a editar
    public static void cargarDatosEditar() throws SQLException{
        listUsu.buscarUsuario.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex=listUsu.listaUsus.getSelectedIndex();
                System.out.println(selectedIndex);
                if(selectedIndex != -1){
                    String selectedElement = listUsu.listaUsus.getModel().getElementAt(selectedIndex);
                    System.out.println(selectedElement);
                    String [] partes = selectedElement.split(" ");
                    
                    if (partes.length >= 3){
                        String booking_code = partes[0];
                        reserva.setCod_booking(Integer.parseInt(booking_code));
                    }
                }
            }
        });
        Controlador.editarUsu();
        try{
            edUsu.buttonGroupEditar.add(edUsu.AmonestadoCheck);
            edUsu.buttonGroupEditar.add(edUsu.CorrectoCheck);
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
                    edUsu.AmonestadoCheck.setSelected(false);
                    edUsu.CorrectoCheck.setSelected(true);
                }else if (status == 0){
                    edUsu.AmonestadoCheck.setSelected(true);
                    edUsu.CorrectoCheck.setSelected(false);
                }

            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
    }
    //Guardar los datos editados en la edicion
    public static void guardarEdicionUsu() throws SQLException{
        usu.setUserCode(Integer.parseInt(edUsu.EditUsuDNI.getText()));
        usu.setUserName(edUsu.EditUsuName.getText());
        usu.setUserSurname(edUsu.EditUsuSurname.getText());
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
        }
    }
    //Cargar los datos personales en el perfil del usuario
    public static void cargarDatosPerfilUsuario(){
        Controlador.abrirPerfilUsu();
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "SELECT dni, name, surname, mail FROM users WHERE userCode='"+usu.getUserCode()+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            if(result.next()){
                String dni = result.getString("dni");
                String name = result.getString("name");
                String surname = result.getString("surname");
                String mail = result.getString("mail");
                profileUsu.perilUsuarioName.setText(name);
                profileUsu.perilUsuarioName.setEditable(false);
                profileUsu.perilUsuarioName.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                usu.setUserName(name);
                profileUsu.perfilUsuarioSurname.setText(surname);
                profileUsu.perfilUsuarioSurname.setEditable(false);
                profileUsu.perfilUsuarioSurname.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                usu.setUserSurname(surname);
                profileUsu.perfilUsuarioDni.setText(dni);
                profileUsu.perfilUsuarioDni.setEditable(false);
                profileUsu.perfilUsuarioDni.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                usu.setUserDNI(dni);
                profileUsu.perfilUsuarioCorreo.setText(mail);
                profileUsu.perfilUsuarioCorreo.setEditable(false);
                profileUsu.perfilUsuarioCorreo.setBorder(javax.swing.BorderFactory.createEmptyBorder());
                usu.setUserMail(mail);
                
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos "+ex.getMessage());

        }
    }
    //abrir y cargar datos del usuario
    public static void abrirYCargarDatos(){
        Controlador.editarUsuPubli();
        edUsuPubli.EditUsuName.setText(usu.getUserName());
        edUsuPubli.EditUsuSurname.setText(usu.getUserSurname());
        edUsuPubli.EditUsuDNI.setText(usu.getUserDNI());
        edUsuPubli.EditUsuMail.setText(usu.getUserMail());
    }
    //Guardar los datos de la edicion
    public static void guardarEdicionUsuPubli(){
        usu.setUserDNI(edUsuPubli.EditUsuDNI.getText());
        usu.setUserName(edUsuPubli.EditUsuName.getText());
        usu.setUserSurname(edUsuPubli.EditUsuSurname.getText());
        usu.setUserMail(edUsuPubli.EditUsuMail.getText());
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "UPDATE users SET dni=?, name=?, surname=?, mail=? WHERE userCode='"+usu.getUserCode()+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            consulta.setString(1,usu.getUserDNI());
            consulta.setString(2,usu.getUserName());
            consulta.setString(3,usu.getUserSurname());
            consulta.setString(4,usu.getUserMail());
            int insertedRows=consulta.executeUpdate();
            System.out.println("Actualizaciones: "+insertedRows);
            Controlador.volverYLimpiarButton(edUsuPubli);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
    }
    //Funcion que cambia la pass si se cumplen todas las condiciones
    public static void confirmarCambiarPass()throws SQLException{
        try{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
        String query = "SELECT userPass FROM users WHERE userCode="+usu.getUserCode()+";";
        PreparedStatement consulta = con.prepareStatement(query);
        ResultSet result = consulta.executeQuery();
        if(result.next()){
           String passUsu = result.getString("userPass");
           String passActual = changePass.currentPass.getText();
            if(passUsu.equals(passActual)){
                String newPass = changePass.newPass.getText();
                String passCheck = changePass.newPassCheck.getText();
                if (newPass.equals(passCheck)){
                    String updateQuery= "UPDATE users SET userPass = ? WHERE dni ="+usu.getUserDNI()+";";
                    PreparedStatement consultaDos = con.prepareStatement(updateQuery);
                    consultaDos.setString(1,newPass);
                    consultaDos.executeUpdate();
                    changePass.setVisible(false);
                    edUsuPubli.setVisible(true);
                    edUsuPubli.setTitle("Mi perfil");
                    edUsuPubli.setLocationRelativeTo(null);
                    
                }else{
                    changePass.currentPass.setText("");
                    changePass.newPass.setText("");
                    changePass.newPassCheck.setText("");
                    changePass.errorNewPass.setVisible(true);
                }
            }else{
                changePass.currentPass.setText("");
                changePass.newPass.setText("");
                changePass.newPassCheck.setText("");
                changePass.errorCheckPass.setVisible(true);
            }
        }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getMessage());
        }
    }
    //Muestra los datos de la reserva
    public static void obtenerDatosReserva() throws SQLException{
        java.util.Date fechaSeleccionada = selectFieldMonth.calendarioPistas.getDate();
        Date fechaSQL = new Date(fechaSeleccionada.getTime());
        reserva.setDiaReserva(fechaSQL);
        String horaInicio = (String) selectFieldMonth.horaInicio.getSelectedItem();
        horaInicio+=":00";
        reserva.setHoraInicio(horaInicio);
        String horaFinal = (String) selectFieldMonth.horaFin.getSelectedItem();
        horaFinal+=":00";
        reserva.setHoraFin(horaFinal);
        Time horaSQLInicio = Time.valueOf(horaInicio);
        Time horaSQLFin = Time.valueOf(horaFinal);
        try{
            ArrayList<Integer> pistasOcupadas = new ArrayList<>();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query = "SELECT fNum FROM bookings WHERE fecha='"+fechaSQL+"' AND sHour='"+horaSQLInicio+"' AND eHour='"+horaSQLFin+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            ResultSet result = consulta.executeQuery();
            while(result.next()){
                int codPista = result.getInt("fNum");
                pistasOcupadas.add(codPista);
            }
            String query2;
            if(pistasOcupadas.isEmpty()){
                query2="SELECT field_code FROM fields";
            }else{
                query2= "SELECT field_code FROM fields WHERE field_code NOT IN(";
                for(int i=0; i<pistasOcupadas.size();i++){
                    query2+="?";
                    if(i<pistasOcupadas.size()-1){
                        query2+=",";
                    }
                }
                query2+=") LIMIT 1;";
            }
            PreparedStatement pState = con.prepareStatement(query2);
            for (int i=0;i<pistasOcupadas.size();i++){
                pState.setInt(i+1,pistasOcupadas.get(i));
            }
            ResultSet rs = pState.executeQuery();
            if(rs.next()){
                reserva.setPistaLibreCod(rs.getInt("field_code"));
                String query3 = "INSERT INTO bookings (fecha,sHour,eHour,fNum,userDNI) VALUES (?,?,?,?,?)";
                PreparedStatement consulta3 = con.prepareStatement(query3);
                consulta3.setDate(1,fechaSQL);
                consulta3.setTime(2, horaSQLInicio);
                consulta3.setTime(3, horaSQLFin);
                consulta3.setInt(4,reserva.getPistaLibreCod());
                consulta3.setString(5,usu.getUserDNI());
                consulta3.executeUpdate();
                selectFieldMonth.setVisible(false);
                Controlador.abrirDatosReserva();
            }else{
                selectFieldMonth.noPistas.setVisible(true);
            }
            con.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"ERROR: "+ex.getMessage());
        }
    }
    //Funcion para cancelar la reserva
    public static void cancelarReserva () throws SQLException{
        listaBookings.botonCancelarReserva.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex=listaBookings.listBookings.getSelectedIndex();
                System.out.println(selectedIndex);
                if(selectedIndex != -1){
                    String selectedElement = listaBookings.listBookings.getModel().getElementAt(selectedIndex);
                    System.out.println(selectedElement);
                    String [] partes = selectedElement.split(" ");
                    
                    if (partes.length >= 5){
                        String bookingCode = partes[0];
                        reserva.setCod_booking(Integer.parseInt(bookingCode));
                    }
                }
            try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/padelapp","root","");
            String query= "DELETE FROM bookings WHERE booking_cod='"+reserva.getCod_booking()+"';";
            PreparedStatement consulta = con.prepareStatement(query);
            consulta.executeUpdate();
            listaBookings.setVisible(false);
            Controlador.listReservas();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se ha podido establecer la conexion a la base de datos"+ex.getMessage());

        }
            }
        });
   
    }
}
