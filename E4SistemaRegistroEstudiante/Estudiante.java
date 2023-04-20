
public class Estudiante
{
     private int codigo;
    private String nombre;
    private String apellido;

    public Estudiante(int codigo, String nombre, String apellido) 
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public void setCodigo() 
    {
        this.codigo=codigo;
    }

    public void setNombre() {
        this.nombre=nombre;
    }

    public void setApellido() 
    {
        this.apellido=apellido;
    }
}
