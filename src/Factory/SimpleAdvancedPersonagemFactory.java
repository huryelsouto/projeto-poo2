package Factory;

import Context.*;
import DecoracaoAtaque.*;
import java.util.Random;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */
public class SimpleAdvancedPersonagemFactory extends Game {
    private static SimpleAdvancedPersonagemFactory instancia = new SimpleAdvancedPersonagemFactory();
    
    private SimpleAdvancedPersonagemFactory(){}

    public static SimpleAdvancedPersonagemFactory getInstancia() {
        return instancia;
    }

    public Personagem createPersonagem() {
        Random rand = new Random();

        double tipo = rand.nextDouble();

        if (tipo <= 0.2) {
            Personagem p1 = new Personagem01();
            p1.setAtaque(new Poder1(p1.getAtaque()));
            return p1;
        } else if (tipo <= 0.4) {
            Personagem p2 = new Personagem02();
            p2.setAtaque(new Poder2(p2.getAtaque()));
            return p2;
        } else if (tipo <= 0.6) {
            Personagem p3 = new Personagem03();
            p3.setAtaque(new Poder1(p3.getAtaque()));
            return p3;
        } else if (tipo <= 0.8) {
            Personagem p4 = new Personagem04();
            p4.setAtaque(new Poder1(p4.getAtaque()));
            return p4;
        } else {
            Personagem p5 = new Personagem05();
            p5.setAtaque(new Poder1(p5.getAtaque()));
            return p5;
        }
    }
}
