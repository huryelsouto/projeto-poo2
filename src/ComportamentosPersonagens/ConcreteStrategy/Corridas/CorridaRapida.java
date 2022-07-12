package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class CorridaRapida implements Correr {
    private static CorridaRapida instancia = new CorridaRapida();

    private CorridaRapida() {}

    public static CorridaRapida getInstancia() {
        return instancia;
    }
    
    @Override
    public void correr() {
        System.out.println("Corrida rápida."); 
    }
    
}
