package CadeiaEscudos;


/**
 *
 * @author Tiago
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
