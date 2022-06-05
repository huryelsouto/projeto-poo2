package ComportamentosPersonagens.Strategy;

public abstract class Atacar {
    int valorAtaque;

    public int getValorAtaque() {
        return valorAtaque;
    }

    public void setValorAtaque(int valorAtaque) {
        this.valorAtaque = valorAtaque;
    }
    
    public abstract void atacar();
}
