
package Pinos;

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
