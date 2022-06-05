package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueMedio extends Atacar{

    public AtaqueMedio() {
       setValorAtaque(20);
    }

    @Override
    public void atacar() {
        System.out.println("Ataque médio: "+getValorAtaque()); 
    }
    
}
