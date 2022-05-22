package Context;

import ComportamentosPersonagens.Strategy.Atacar;
import ComportamentosPersonagens.Strategy.Correr;
import ComportamentosPersonagens.Strategy.Pular;

public abstract class Personagem {
    private Atacar ataque;
    private Correr corrida;
    private Pular pulo;
    
    public void setAtaque(Atacar a){
        this.ataque = a;
    }

     public void setCorrida(Correr c){
        this.corrida = c;
    }

     public void setPulo(Pular p){
        this.pulo = p;
    }
     
    public void atacar(){
        this.ataque.atacar();
    }

    public void correr(){
        this.corrida.correr();
    }

    public void pular(){
        this.pulo.pular();
    }

    
}
