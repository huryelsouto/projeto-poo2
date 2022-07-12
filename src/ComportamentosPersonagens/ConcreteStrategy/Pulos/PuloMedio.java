package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class PuloMedio implements Pular{
    private static PuloMedio instancia = new PuloMedio();

    private PuloMedio() {}

    public static PuloMedio getInstancia() {
        return instancia;
    }
    
    @Override
    public void pular() {
        System.out.println("Pulo médio.");
    }
    
}
