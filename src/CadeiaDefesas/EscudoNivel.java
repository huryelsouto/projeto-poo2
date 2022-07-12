/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadeiaDefesas;

import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class EscudoNivel extends Defesa {
    int valorDefesa;

    public EscudoNivel(int valorDefesa) {
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
