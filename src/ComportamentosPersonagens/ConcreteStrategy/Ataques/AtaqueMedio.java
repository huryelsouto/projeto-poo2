package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueMedio implements Atacar{

    @Override
    public void atacar() {
        System.out.println("Ataque médio."); 
    }
    
}
