package Context;

import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.ConcreteStrategy.Corridas.CorridaRapida;
import ComportamentosPersonagens.ConcreteStrategy.Pulos.PuloBaixo;

public class Personagem03 extends Personagem{
    public Personagem03(){
        this.setPulo(new PuloBaixo());
        this.setCorrida(new CorridaRapida());
        this.setAtaque(new AtaqueForte());
    }
}
