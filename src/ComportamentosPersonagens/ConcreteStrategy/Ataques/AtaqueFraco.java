package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueFraco implements Atacar{

    @Override
    public void atacar() {
        System.out.println("Ataque fraco."); 
    }
    
}
