package CadeiaEscudos;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public abstract class Escudo {
    private Escudo sucessor;

    public void setSucessor(Escudo sucessor) {
        this.sucessor = sucessor;
    }

    public Escudo getSucessor(){
        return this.sucessor;
    }
    
    public abstract int processaDano(int dano);
}
