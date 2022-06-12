package Context;

import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloBaixo;
import EstadosPersonagens.EstadoNormal;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class Personagem04 extends Personagem {

    public Personagem04() {
        this.setNivelEnergia(70);
        this.setPulo(new PuloBaixo());
        this.setEstado(new EstadoNormal(this));
    }
}
