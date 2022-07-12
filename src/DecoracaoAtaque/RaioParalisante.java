package DecoracaoAtaque;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class RaioParalisante extends AtaqueDecorator {
    public RaioParalisante(Atacar ataqueDecorado) {
       super(ataqueDecorado);
       setValorAtaque(50);
    }
}
