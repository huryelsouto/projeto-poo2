package ComportamentosPersonagens.ConcreteStrategy.Corridas;

import ComportamentosPersonagens.Strategy.Correr;

public class CorridaMedia implements Correr {

    @Override
    public void correr() {
        System.out.println("Corrida média."); 
    }
    
}
