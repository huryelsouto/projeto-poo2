package Factory;

import Context.*;
import DecoracaoAtaque.*;
import java.util.Random;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */
public abstract class Game {

    public abstract Personagem createPersonagem();
    
    public void jogar(){
        Personagem p1 = createPersonagem();
        p1.atacar();
        p1.correr();
        
        Personagem p2 = createPersonagem();
        p2.atacar();
        p2.correr();
    }
}
