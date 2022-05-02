/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pinos;



public class Teste {

    public static void main(String[] args) {    
        BuracoRedondo buracoRedondo = new BuracoRedondo(5);
        PinoRedondo pinoRedondo = new PinoRedondo(5);

        if (buracoRedondo.encaixa(pinoRedondo)){
            System.out.println("o pino redondo de raio: 5 se encaixa no furo de raio: 5.");  
    }
        PinoQuadrado PinoMenor = new PinoQuadrado(5);
        PinoQuadrado PinoMaior = new PinoQuadrado(15);

        PinoQuadradoAdapter PinoMenorAdapter = new PinoQuadradoAdapter(PinoMenor);
        PinoQuadradoAdapter PinoMaiorAdapter = new PinoQuadradoAdapter(PinoMaior);
        if (buracoRedondo.encaixa(PinoMenorAdapter)) {
            System.out.println("O pino quadrado de raio: 5 se enciaxa no buraco de raio: 5.");
        }
        if (!buracoRedondo.encaixa(PinoMaiorAdapter)) {
            System.out.println("o Pino Quadrado de raio: 15 não se encaixa no buraco de raio: 5.");
        }
    }
}
