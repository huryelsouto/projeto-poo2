package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

public class AtaqueForte extends Atacar{

    public AtaqueForte() {
        setValorAtaque(30);
    }

    @Override
    public void atacar() {
        System.out.println("Ataque forte: " + getValorAtaque()); 
    }
    
}
