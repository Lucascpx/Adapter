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
public class PinoQuadrado {
    
    private double largura;
    
    public PinoQuadrado(double largura){
        this.largura = largura;
    }
        
    public double getLargura(){
        return largura;
        
    }
    public double getQuadrado(){
        double operacao;
        operacao = Math.pow(this.largura, 2);
        return operacao;
    }
            
}
