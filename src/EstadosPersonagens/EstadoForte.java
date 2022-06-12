package EstadosPersonagens;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaRapida;
import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class EstadoForte extends EstadoPersonagem{
    
    public EstadoForte(Personagem per){
        super(per);
        this.getPersonagem().setAtaque(new AtaqueForte());
        this.getPersonagem().setCorrida(new CorridaRapida());
        
    }
    
    @Override
    public void setLimites() {
        this.setLimiteInferior(71);
        this.setLimiteSuperior(100);
    }

    @Override
    public void verificarAlteracaoEstado() {
        if(this.getPersonagem().getNivelEnergia() < this.getLimiteInferior()){
            this.getPersonagem().setEstado(new EstadoNormal(this.getPersonagem()));
            this.getPersonagem().getEstado().verificarAlteracaoEstado();

        }
    }
    
}
