package Context;

import ComportamentosPersonagens.Strategy.Atacar;
import ComportamentosPersonagens.Strategy.Correr;
import ComportamentosPersonagens.Strategy.Pular;
import EstadosPersonagens.EstadoPersonagem;

public abstract class Personagem {

    private Atacar ataque;
    private Correr corrida;
    private Pular pulo;
    private int nivelEnergia;
    private EstadoPersonagem estado;

    public void setAtaque(Atacar a) {
        this.ataque = a;
    }

    public void setCorrida(Correr c) {
        this.corrida = c;
    }

    public void setPulo(Pular p) {
        this.pulo = p;
    }

    public Atacar getAtaque() {
        return ataque;
    }

    public Correr getCorrida() {
        return corrida;
    }

    public Pular getPulo() {
        return pulo;
    }

    public int getNivelEnergia() {
        return nivelEnergia;
    }

    public void setNivelEnergia(int nivelEnergia) {
        this.nivelEnergia = nivelEnergia;
    }

    public void atacar() {
        this.ataque.atacar();
    }

    public void correr() {
        this.corrida.correr();
    }

    public void pular() {
        this.pulo.pular();
    }

    public EstadoPersonagem getEstado() {
        return estado;
    }

    public void setEstado(EstadoPersonagem estado) {
        this.estado = estado;
    }
    
    public void perdeNivelEnergia(int valorPerda){
        this.setNivelEnergia(this.getNivelEnergia() - valorPerda);
        this.getEstado().verificarAlteracaoEstado();
    }
    
    public void ganhaNivelEnergia(int valorGanho){
        this.setNivelEnergia(this.getNivelEnergia() + valorGanho);
        this.getEstado().verificarAlteracaoEstado();
    }

}
