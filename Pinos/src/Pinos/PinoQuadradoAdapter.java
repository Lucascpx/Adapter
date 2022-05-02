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
public class PinoQuadradoAdapter extends PinoRedondo{
    
private PinoQuadrado pino;

    public PinoQuadradoAdapter(PinoQuadrado pino){
        this.pino = pino;
        
    }
    @Override
    public double getRaio() {
        double conta;
        conta = (Math.sqrt(Math.pow((pino.getLargura() / 2), 2) * 2));
        return conta;
    }
}

