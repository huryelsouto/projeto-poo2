package EstadosPersonagens;

import Context.Personagem;

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
