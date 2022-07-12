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
public class MedievalGameFactory extends AbstractGameFactory {

    private static MedievalGameFactory instancia = new MedievalGameFactory();

    private MedievalGameFactory() {
    }

    public static MedievalGameFactory getInstancia() {
        return instancia;
    }

    @Override
    public Personagem createPersonagem() {
        return new Arqueiro();
    }

    @Override
    public Atacar createArma() {
        return new ArcoEFlecha(AtaqueFraco.getInstancia());
    }

    @Override
    public Defesa createDefesa() {
        return new EscudoNivel(15);
    }

}
