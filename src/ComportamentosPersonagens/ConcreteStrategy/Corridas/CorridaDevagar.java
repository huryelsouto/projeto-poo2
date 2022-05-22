package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

public class CorridaDevagar implements Correr {

    @Override
    public void correr() {
        System.out.println("Corrida devagar."); 
    }
    
}
