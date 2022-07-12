package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class CorridaMedia implements Correr {
    private static CorridaMedia instancia = new CorridaMedia();

    private CorridaMedia() {}

    public static CorridaMedia getInstancia() {
        return instancia;
    }
    
    @Override
    public void correr() {
        System.out.println("Corrida média."); 
    }
    
}
