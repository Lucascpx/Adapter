/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinos;

/**
 *
 * @author Leticia
 */
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
