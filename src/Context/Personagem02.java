package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueMedio;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaRapida;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloAlto;


public class Personagem02 extends Personagem{
    public Personagem02(){
        this.setPulo(new PuloAlto());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueMedio());
    }
}
