public class Documento
{
    private String rutaArchivo;
    private String contenido;
    private String nombreArchivo;

    public Documento(String nombreArchivo, String rutaArchivo) 
    {
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
    }

    public void setContenido(String contenido) 
    {
        this.contenido = contenido;
    }

    public String getContenido() 
    {
        return contenido;
    }

    public String getNombreArchivo() 
    {
        return nombreArchivo;
    }

    public String getRutaArchivo() 
    {
        return rutaArchivo;
    }
    public void mostrarcont()
    {
         System.out.println(getContenido());
    }
}