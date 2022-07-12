package CadeiaDefesas;

import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class CampoMagnetico extends Defesa {
    int valorDefesa;

    public CampoMagnetico(int valorDefesa) {
        this.valorDefesa = valorDefesa;
    }
    
    @Override
    public int processaDano(int dano){
        if (getSucessor() == null) {
            return (dano - valorDefesa);
        }
        
        if (dano <= 0){
           return getSucessor().processaDano(0);
        } else {
           return getSucessor().processaDano(dano - valorDefesa);
        }
    }
}
