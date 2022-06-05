package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueFraco extends Atacar{

    public AtaqueFraco() {
        setValorAtaque(10);
    }

    @Override
    public void atacar() {
        System.out.println("Ataque fraco: "+getValorAtaque()); 
    }
    
}
