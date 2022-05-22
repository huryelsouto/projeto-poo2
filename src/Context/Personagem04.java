package Context;

import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloBaixo;
import EstadosPersonagens.EstadoNormal;

public class Personagem04 extends Personagem {

    public Personagem04() {
        this.setNivelEnergia(70);
        this.setPulo(new PuloBaixo());
        this.setEstado(new EstadoNormal(this));
    }
}
