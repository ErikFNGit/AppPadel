package pyectopadelappModelo;
import java.util.Date;



public class Bookings {
    private String HoraInicio;
    private String HoraFin;
    private int codUsuReserva;
    private Date diaReserva;
    private int pistaLibreCod;

    public Date getDiaReserva() {
        return diaReserva;
    }
    public void setDiaReserva(Date diaReserva) {
        this.diaReserva = diaReserva;
    }

    public int getPistaLibreCod() {
        return pistaLibreCod;
    }
    public void setPistaLibreCod(int pistaLibreCod) {
        this.pistaLibreCod = pistaLibreCod;
    }  
    
    public String getHoraInicio() {
        return HoraInicio;
    }
    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFin() {
        return HoraFin;
    }
    public void setHoraFin(String HoraFin) {
        this.HoraFin = HoraFin;
    }

    public int getCodUsuReserva() {
        return codUsuReserva;
    }
    public void setCodUsuReserva(int codUsuReserva) {
        this.codUsuReserva = codUsuReserva;
    }   
}
