package CadeiaDefesas;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public abstract class Defesa {
    private Defesa sucessor;

    public void setSucessor(Defesa sucessor) {
        this.sucessor = sucessor;
    }

    public Defesa getSucessor(){
        return this.sucessor;
    }
    
    public abstract int processaDano(int dano);
}
