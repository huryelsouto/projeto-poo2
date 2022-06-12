package Context;

import CadeiaEscudos.Escudo;
import ComportamentosPersonagens.Strategy.Atacar;
import ComportamentosPersonagens.Strategy.Correr;
import ComportamentosPersonagens.Strategy.Pular;
import EstadosPersonagens.EstadoPersonagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public abstract class Personagem {

    private Atacar ataque;
    private Correr corrida;
    private Pular pulo;
    private int nivelEnergia;
    private EstadoPersonagem estado;
    private Escudo escudo;

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }

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
        if (this.getEscudo() != null){
            valorPerda = this.getEscudo().processaDano(valorPerda);
        }
        
        this.setNivelEnergia(this.getNivelEnergia() - valorPerda);
        this.getEstado().verificarAlteracaoEstado();
    }
    
    public void ganhaNivelEnergia(int valorGanho){
        this.setNivelEnergia(this.getNivelEnergia() + valorGanho);
        this.getEstado().verificarAlteracaoEstado();
    }
    
    public void pegaEscudo(Escudo novoEscudo){
        if (this.getEscudo() == null){
            this.setEscudo(novoEscudo);
        } else {
            Escudo aux = this.getEscudo();
            // percorre a cadeia de escudos até chegar no último escudo
            // e então adicionar um novo ao final
            while (aux.getSucessor() != null) {                
                aux = aux.getSucessor();
            }
            aux.setSucessor(novoEscudo);
        }
    }
    
    public void perdeEscudo(){
        if (this.getEscudo() == null){
            return;
        }
        
        if (this.getEscudo().getSucessor() == null){
            this.setEscudo(null);
            return;
        }
        
        // nesse caso o personagem tem um escudo e esse escudo tem sucessor
        this.setEscudo(this.getEscudo().getSucessor());
    }

}
