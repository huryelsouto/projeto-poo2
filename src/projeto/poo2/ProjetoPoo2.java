package projeto.poo2;

import Context.Personagem;
import Context.Personagem01;
import Context.Personagem02;
import Context.Personagem03;

public class ProjetoPoo2 {

    public static void main(String[] args) {
        
        Personagem p1 = new Personagem01();
        Personagem p2 = new Personagem02();
        Personagem p3 = new Personagem03();
        
        
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
        
    }
    
}
