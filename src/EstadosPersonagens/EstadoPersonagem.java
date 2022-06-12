package EstadosPersonagens;

import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public abstract class EstadoPersonagem {

    private Personagem personagem;
    private int limiteInferior;
    private int limiteSuperior;

    EstadoPersonagem(Personagem per) {
        this.personagem = per;
        setLimites();
    }

    public abstract void setLimites();
    public abstract void verificarAlteracaoEstado();

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public void setLimiteInferior(int limiteInferior) {
        this.limiteInferior = limiteInferior;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }

    public void setLimiteSuperior(int limiteSuperior) {
        this.limiteSuperior = limiteSuperior;
    }

}
