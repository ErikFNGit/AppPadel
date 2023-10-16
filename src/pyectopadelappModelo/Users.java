package pyectopadelappModelo;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Users {
    private String userDNI;
    private int userCode;
    private String userName;
    private String userSurname;
    private String userMail;
    private int userStatus;
    private int isAdmin;

    public String getUserDNI() {
        return userDNI;
    }
    public void setUserDNI(String userDNI) {
        this.userDNI = userDNI;
    }

    public int getUserCode() {
        return userCode;
    }
    public void setUserCode(int userCode) {
        this.userCode = userCode;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }
    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserMail() {
        return userMail;
    }
    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public int getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public int getIsAdmin() {
        return isAdmin;
    }
    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    
    
}
