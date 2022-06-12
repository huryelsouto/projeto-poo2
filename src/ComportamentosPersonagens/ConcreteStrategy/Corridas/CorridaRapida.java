package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class CorridaRapida implements Correr {

    @Override
    public void correr() {
        System.out.println("Corrida rápida."); 
    }
    
}
