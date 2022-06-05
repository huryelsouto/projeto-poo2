package projeto.poo2;

import CadeiaEscudos.Escudo;
import CadeiaEscudos.EscudoNivel;
import ComportamentosPersonagens.ConcreteStrategy.Ataques.AtaqueForte;
import ComportamentosPersonagens.Strategy.Atacar;
import Context.Personagem;
import Context.Personagem01;
import Context.Personagem02;
import Context.Personagem03;
import Context.Personagem04;
import DecoracaoAtaque.*;

public class ProjetoPoo2 {

    public static void main(String[] args) {
        
        Personagem p1 = new Personagem01();
        Personagem p2 = new Personagem02();
        Personagem p3 = new Personagem03();
        Personagem p4 = new Personagem04();
        Personagem p5 = new Personagem04();
        
        // Padrão Strategy
        System.out.println("Comportamentos Personagem 01:");
        p1.pular();
        p1.correr();
        p1.atacar();
        
        System.out.println("Comportamentos Personagem 02:");
        p2.pular();
        p2.correr();
        p2.atacar();
        
        System.out.println("Comportamentos Personagem 03:");
        p3.pular();
        p3.correr();
        p3.atacar();
        
        // Padrão State
        System.out.println("\n\nComportamentos Personagem 04:");
        System.out.println(p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();
        
        p4.ganhaNivelEnergia(1);
        System.out.println("\n\n"+p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();
        
        p4.perdeNivelEnergia(42);
        System.out.println("\n\n"+p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();
        
        p4.perdeNivelEnergia(29);
        System.out.println("\n\n"+p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();
        
        
        // Padrão Chain of Responsability
        Escudo escudoNivel1 = new EscudoNivel(5);
        Escudo escudoNivel2 = new EscudoNivel(2);
        Escudo escudoNivel3 = new EscudoNivel(1);
        Escudo escudoNivel4 = new EscudoNivel(3);
        
        escudoNivel1.setSucessor(escudoNivel2);
        escudoNivel2.setSucessor(escudoNivel3);
        escudoNivel3.setSucessor(escudoNivel4);
        
        System.out.println("\n\nVida antes: "+p5.getNivelEnergia());
        escudoNivel1.processaDano(20, p5);
        System.out.println("Vida depois: "+p5.getNivelEnergia());
        
        System.out.println("\n\n");
        
        // Padrão Decorator
        Atacar ataque1 = new AtaqueForte(); 
        ataque1 = new Poder1(ataque1);
        
        p1.atacar();
        p1.setAtaque(new Poder1(p1.getAtaque()));
        p1.atacar();
    }
    
}
