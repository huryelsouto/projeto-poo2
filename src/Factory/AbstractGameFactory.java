package Factory;

import CadeiaDefesas.*;
import ComportamentosPersonagens.Strategy.*;
import Context.*;
import DecoracaoAtaque.*;
import java.util.Random;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */
public abstract class AbstractGameFactory {

    public abstract Personagem createPersonagem();
    public abstract Atacar createArma();
    public abstract Defesa createDefesa();
    
}
