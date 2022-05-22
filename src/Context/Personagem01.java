package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaMedia;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloMedio;


public class Personagem01 extends Personagem{
    public Personagem01(){
        this.setPulo(new PuloMedio());
        this.setCorrida(new CorridaMedia());
        this.setAtaque(new AtaqueForte());
    }
}
