package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueForte implements Atacar{

    @Override
    public void atacar() {
        System.out.println("Ataque forte."); 
    }
    
}
