package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaMedia;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloMedio;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class Personagem01 extends Personagem{
    public Personagem01(){
        this.setPulo(new PuloMedio());
        this.setCorrida(new CorridaMedia());
        this.setAtaque(new AtaqueForte());
    }
}
