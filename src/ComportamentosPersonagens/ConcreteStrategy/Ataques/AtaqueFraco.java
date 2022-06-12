package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class AtaqueFraco extends Atacar{

    public AtaqueFraco() {
        setValorAtaque(10);
    }

    @Override
    public void atacar() {
        System.out.println("Ataque fraco: "+getValorAtaque()); 
    }
    
}
