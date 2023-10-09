package pyectopadelappModelo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Pistas {
    private int codPista;
    private int pistaStatus;

    public int getCodPista() {
        return codPista;
    }
    public void setCodPista(int codPista) {
        this.codPista = codPista;
    }

    public int getPistaStatus() {
        return pistaStatus;
    }
    public void setPistaStatus(int pistaStatus) {
        this.pistaStatus = pistaStatus;
    }
    
    
}
