package EstadosPersonagens;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueMedio;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaMedia;
import Context.Personagem;

public class EstadoNormal extends EstadoPersonagem {

    public EstadoNormal(Personagem per) {
        super(per);
        this.getPersonagem().setAtaque(new AtaqueMedio());
        this.getPersonagem().setCorrida(new CorridaMedia());

    }

    @Override
    public void setLimites() {
        this.setLimiteInferior(30);
        this.setLimiteSuperior(70);
    }

    @Override
    public void verificarAlteracaoEstado() {
        if (this.getPersonagem().getNivelEnergia() < this.getLimiteInferior()) {
            this.getPersonagem().setEstado(new EstadoPerigo(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();

        } else if (this.getPersonagem().getNivelEnergia() > this.getLimiteSuperior()) {
            this.getPersonagem().setEstado(new EstadoForte(this.getPersonagem()));
        }
    }

}
