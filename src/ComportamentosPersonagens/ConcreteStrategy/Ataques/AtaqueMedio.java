package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class AtaqueMedio extends Atacar{
    private static AtaqueMedio instancia = new AtaqueMedio();

    private AtaqueMedio() {
        setValorAtaque(20);
    }

    public static AtaqueMedio getInstancia() {
        return instancia;
    }

    @Override
    public void atacar() {
        System.out.println("Ataque médio: "+getValorAtaque()); 
    }
    
}
