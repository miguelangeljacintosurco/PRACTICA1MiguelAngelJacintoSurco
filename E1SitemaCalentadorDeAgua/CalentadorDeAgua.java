
public class CalentadorDeAgua
{
    private int mintemp;
    private int maxtemp;
    private int temp;
    private int increment;
    private int valor = 0;
    public CalentadorDeAgua(int mintemp, int maxtemp, int increment, int inicio)
    {
        this.mintemp = mintemp;
        this.maxtemp = maxtemp;
        this.temp = inicio;
        this.increment = increment;
        this.valor = valor;
    }

    public int getMintemp()
    {
        return this.mintemp; 
    }
    
    public void setMintemp(int mintemp){
        this.mintemp = mintemp;
    }
    
    public int getMaxtemp()
    {
        return this.maxtemp; 
    }
    
    public void setMaxtemp(int maxtemp){
        this.maxtemp = maxtemp;
    }
    
    public int getIncrement()
    {
        return this.increment; 
    }
    
    public void setIncrement(int increment){
        this.increment = increment;
    }
    
    public int getValor()
    {
        return this.valor; 
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    
      public void Calentar()
      {
        if ((this.temp + this.increment) < this.maxtemp){
          this.valor = this.temp += this.increment;
          System.out.println("La temperatura actual es de: "+this.valor + "°Celcios");
        }else{  
          System.out.println("ALERTA!!!  Se alcanzo la temperatura máxima a: "+this.maxtemp + "°Celcios");
          System.out.println("La temperatura actual es de: "+(this.temp += this.increment) + "°Celcios");
    }
  }
  
  public void Enfriar(){
    if ((this.temp - this.increment) > this.mintemp){
      this.valor = this.temp -= this.increment;
      System.out.println("La temperatura actual es de: "+this.valor + "°Celcios");
    }else{
      System.out.println("ALERTA!!!  Se alcanzo la temperatura mínima a: "+this.mintemp + "°Celcios");
      System.out.println("La temperatura actual es de: "+(this.temp -= this.increment) + "°Celcios");
    }
  }
}
