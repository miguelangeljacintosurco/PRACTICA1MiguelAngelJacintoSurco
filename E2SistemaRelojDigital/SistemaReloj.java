public class SistemaReloj
{
    private int segundo = 0;
    private boolean salida = true;
    private int hora = 0;
    private int minuto = 0;
    
    public SistemaReloj()
    {
        this.segundo = segundo;
        this.salida = salida;
        this.hora = hora;
        this.minuto = minuto;
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public void setHora(int hora){
        this.hora = hora;
    }
    
    public int getMinuto(){
        return this.minuto;
    }
    
    public void setMinuto(int minuto){
        this.minuto = minuto;
    }
    
    public int getSegundo(){
        return this.segundo;
    }
    
    public void setSegundo(int segundo){
        this.segundo = segundo;
    }
    
    public boolean getSalida(boolean salida){
         return this.salida;
    }
    
    public void setSalida(boolean salida){
        this.salida = salida;
    }
    
    public void inicioReloj()
    {
        while(this.salida){
            if(this.hora<10){
                System.out.print ("0");
            }
            System.out.print (this.hora+":");
   
            if(segundo<10){
                System.out.print ("0");
            }
            System.out.println (this.segundo);
            
            segundo++;
        
            if(this.segundo == 60){
                this.segundo = 0;
                    this.hora++;
                    if(this.hora == 24){
                        this.hora = 0;
                        this.salida = false;
                    }
            }
            
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
