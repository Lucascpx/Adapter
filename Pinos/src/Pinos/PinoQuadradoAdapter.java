
package Pinos;

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

