package Context;

import CadeiaDefesas.Defesa;
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
    private Defesa defesa;

    public Defesa getDefesa() {
        return defesa;
    }

    public void setDefesa(Defesa escudo) {
        this.defesa = escudo;
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
        if (this.getDefesa() != null){
            valorPerda = this.getDefesa().processaDano(valorPerda);
        }
        
        this.setNivelEnergia(this.getNivelEnergia() - valorPerda);
        this.getEstado().verificarAlteracaoEstado();
    }
    
    public void ganhaNivelEnergia(int valorGanho){
        this.setNivelEnergia(this.getNivelEnergia() + valorGanho);
        this.getEstado().verificarAlteracaoEstado();
    }
    
    public void pegaEscudo(Defesa novoEscudo){
        if (this.getDefesa() == null){
            this.setDefesa(novoEscudo);
        } else {
            Defesa aux = this.getDefesa();
            // percorre a cadeia de escudos até chegar no último defesa
            // e então adicionar um novo ao final
            while (aux.getSucessor() != null) {                
                aux = aux.getSucessor();
            }
            aux.setSucessor(novoEscudo);
        }
    }
    
    public void perdeEscudo(){
        if (this.getDefesa() == null){
            return;
        }
        
        if (this.getDefesa().getSucessor() == null){
            this.setDefesa(null);
            return;
        }
        
        // nesse caso o personagem tem um defesa e esse defesa tem sucessor
        this.setDefesa(this.getDefesa().getSucessor());
    }

}
