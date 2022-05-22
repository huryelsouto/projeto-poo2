package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

public class CorridaRapida implements Correr {

    @Override
    public void correr() {
        System.out.println("Corrida rápida."); 
    }
    
}
