package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class AtaqueForte extends Atacar{

    public AtaqueForte() {
        setValorAtaque(30);
    }

    @Override
    public void atacar() {
        System.out.println("Ataque forte: " + getValorAtaque()); 
    }
    
}
