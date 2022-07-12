package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class PuloBaixo implements Pular{
    private static PuloBaixo instancia = new PuloBaixo();

    private PuloBaixo() {}

    public static PuloBaixo getInstancia() {
        return instancia;
    }
    
    @Override
    public void pular() {
        System.out.println("Pulo baixo.");
    }
    
}
