/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadeiaEscudos;

import Context.Personagem;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class EscudoNivel extends Escudo {
    int defesa;

    public EscudoNivel(int defesa) {
        this.defesa = defesa;
    }
    
    @Override
    public int processaDano(int dano){
        if (getSucessor() == null) {
            return (dano - defesa);
        }
        
        if (dano <= 0){
           return getSucessor().processaDano(0);
        } else {
           return getSucessor().processaDano(dano - defesa);
        }
    }
}
