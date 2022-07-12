package Factory;

import CadeiaDefesas.*;
import ComportamentosPersonagens.ConcreteStrategy.Ataques.*;
import ComportamentosPersonagens.Strategy.*;
import Context.*;
import DecoracaoAtaque.*;
import java.util.Random;

/**
 *
 * Huryel Souto Costa - 12011BCC022 Tiago da Silva e Souza Pinto - 12011BCC001
 */
public class FuturisticGameFactory extends AbstractGameFactory {

    private static FuturisticGameFactory instancia = new FuturisticGameFactory();

    private FuturisticGameFactory() {
    }

    public static FuturisticGameFactory getInstancia() {
        return instancia;
    }

    @Override
    public Personagem createPersonagem() {
        return new Robo();
    }

    @Override
    public Atacar createArma() {
        return new RaioParalisante(AtaqueFraco.getInstancia());
    }

    @Override
    public Defesa createDefesa() {
        return new EscudoNivel(20);
    }

}
