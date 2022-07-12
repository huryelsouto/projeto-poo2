package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueMedio;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaRapida;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloAlto;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class Personagem02 extends Personagem{
    public Personagem02(){
        this.setPulo(PuloAlto.getInstancia());
        this.setCorrida(CorridaRapida.getInstancia());
        this.setAtaque(AtaqueMedio.getInstancia());
    }
}
