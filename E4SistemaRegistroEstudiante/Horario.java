
public class Horario
{
    private String dia;
    private int horaInicio;
    private int horaFinal;

    public Horario(String dia, int horaInicio, int horaFinal) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFinal = horaFinal;
    }

    public String getDia() {
        return dia;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public int getHoraFin() {
        return horaFinal;
    }
    
    public void setHoraInicio() {
        this.horaInicio=horaInicio;
    }

    public void setHoraFin() {
        this.horaFinal=horaFinal;
    }
}
