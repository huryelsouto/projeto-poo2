package Factory;

import Context.Personagem;
import Context.Personagem04;
import DecoracaoAtaque.*;
import java.util.Random;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */
public class SimplePersonagemFactory extends Game {
    private static SimplePersonagemFactory instancia = new SimplePersonagemFactory();
    
    private SimplePersonagemFactory(){}

    public static SimplePersonagemFactory getInstancia() {
        return instancia;
    }

    public Personagem createPersonagem() {
        Random rand = new Random();

        double tipo = rand.nextDouble();

        Personagem p = new Personagem04();
        if (tipo <= 0.2) {
            p.setAtaque(new Poder1(p.getAtaque()));
        } else if (tipo <= 0.4) {
            p.setAtaque(new Poder2(p.getAtaque()));
        } else if (tipo <= 0.6) {
            p.setAtaque(new Poder3(p.getAtaque()));
        } else if (tipo <= 0.8) {
            p.setAtaque(new Poder4(p.getAtaque()));
        } else {
            p.setAtaque(new Poder5(p.getAtaque()));
        }
        return p;
    }
}
