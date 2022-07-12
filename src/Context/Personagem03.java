package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaRapida;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloBaixo;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class Personagem03 extends Personagem{
    public Personagem03(){
        this.setPulo(PuloBaixo.getInstancia());
        this.setCorrida(CorridaRapida.getInstancia());
        this.setAtaque(AtaqueForte.getInstancia());
    }
}
