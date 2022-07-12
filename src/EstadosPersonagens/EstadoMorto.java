package EstadosPersonagens;

import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class EstadoMorto extends EstadoPersonagem{

    public EstadoMorto(Personagem per){
        super(per);
    }
    
    @Override
    public void setLimites() {
        this.setLimiteInferior(0);
        this.setLimiteSuperior(0);
    }

    @Override
    public void verificarAlteracaoEstado() {}
    
}
