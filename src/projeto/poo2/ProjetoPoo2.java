package projeto.poo2;

import CadeiaDefesas.*;
import ComportamentosPersonagens.Strategy.*;
import Context.*;
import DecoracaoAtaque.*;
import Factory.*;

/**
 *
 * Huryel Souto Costa - 12011BCC022 Tiago da Silva e Souza Pinto - 12011BCC001
 */
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
        System.out.println("\n\n" + p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();

        p4.perdeNivelEnergia(42);
        System.out.println("\n\n" + p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();

        p4.perdeNivelEnergia(29);
        System.out.println("\n\n" + p4.getNivelEnergia());
        p4.pular();
        p4.correr();
        p4.atacar();

        // Padrão Chain of Responsability
        Defesa escudoNivel1 = new EscudoNivel(5);
        Defesa escudoNivel2 = new EscudoNivel(2);
        Defesa escudoNivel3 = new EscudoNivel(1);
        Defesa escudoNivel4 = new EscudoNivel(3);

        p5.pegaEscudo(escudoNivel1);
        p5.pegaEscudo(escudoNivel2);
        p5.pegaEscudo(escudoNivel3);
        p5.pegaEscudo(escudoNivel4);

        System.out.println("\n\nVida antes: " + p5.getNivelEnergia());
        p5.perdeNivelEnergia(20);
        System.out.println("Vida depois: " + p5.getNivelEnergia());

        System.out.println("\n\n");

        // Padrão Decorator
        p1.atacar();
        p1.setAtaque(new Poder1(p1.getAtaque()));
        p1.atacar();

        // Simple Factory
        System.out.println("\nFábrica 1:");
        Game factory1 = SimplePersonagemFactory.getInstancia();
        factory1.jogar();

        System.out.println("\nFábrica 2:");
        Game factory2 = SimpleAdvancedPersonagemFactory.getInstancia();
        factory2.jogar();

        System.out.println("\nAbstract Factory:");
        AbstractGameFactory factory = obterFactory(1);
        
        Personagem factoryPersonagem = factory.createPersonagem();
        factoryPersonagem.setAtaque(factory.createArma());
        factoryPersonagem.setDefesa(factory.createDefesa());
        
        System.out.println(factoryPersonagem.getClass().getName());
        System.out.println(factoryPersonagem.getAtaque().getClass().getName());
        System.out.println(factoryPersonagem.getDefesa().getClass().getName());
        
        
    }

    public static AbstractGameFactory obterFactory(int opcao) {
        if (opcao == 1) {
            return MedievalGameFactory.getInstancia();
        } else {
            return FuturisticGameFactory.getInstancia();
        }
    }

}
