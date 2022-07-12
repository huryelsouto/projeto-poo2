package Context;

import ComportamentosPersonagens.ConcreteStrategy.Pulos.*;
import EstadosPersonagens.EstadoNormal;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class Arqueiro extends Personagem {

    public Arqueiro() {
        this.setNivelEnergia(70);
        this.setPulo(PuloMedio.getInstancia());
        this.setEstado(new EstadoNormal(this));
    }
}
