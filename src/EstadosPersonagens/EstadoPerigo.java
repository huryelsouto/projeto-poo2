package EstadosPersonagens;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueFraco;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaDevagar;
import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class EstadoPerigo extends EstadoPersonagem {

    public EstadoPerigo(Personagem per) {
        super(per);
        this.getPersonagem().setAtaque(AtaqueFraco.getInstancia());
        this.getPersonagem().setCorrida(CorridaDevagar.getInstancia());

    }

    @Override
    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(29);
    }

    @Override
    public void verificarAlteracaoEstado() {
        if (this.getPersonagem().getNivelEnergia() <= this.getLimiteInferior()) {
            this.getPersonagem().setEstado(new EstadoMorto(this.getPersonagem()));
        } else if (this.getPersonagem().getNivelEnergia() > this.getLimiteSuperior()) {
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();

        }
    }

}
