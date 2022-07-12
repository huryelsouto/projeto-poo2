package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class PuloAlto implements Pular{
    private static PuloAlto instancia = new PuloAlto();

    private PuloAlto() {}

    public static PuloAlto getInstancia() {
        return instancia;
    }
    
    @Override
    public void pular() {
        System.out.println("Pulo alto.");
    }
    
}
