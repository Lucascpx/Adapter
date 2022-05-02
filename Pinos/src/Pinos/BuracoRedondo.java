
package Pinos;


public class BuracoRedondo {
    
    private double raio;
    
    public BuracoRedondo(double raio){
        this.raio = raio;
     }

  public double getRaio(){
      return raio;
  }

  public boolean encaixa (PinoRedondo pino){
      
      boolean calculo;
        calculo = (this.getRaio() >= pino.getRaio());
        return calculo;
  }
    
}
