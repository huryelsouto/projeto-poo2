package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class CorridaDevagar implements Correr {
    private static CorridaDevagar instancia = new CorridaDevagar();

    private CorridaDevagar() {}

    public static CorridaDevagar getInstancia() {
        return instancia;
    }

    @Override
    public void correr() {
        System.out.println("Corrida devagar."); 
    }
    
}
