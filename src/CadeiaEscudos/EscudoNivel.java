/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadeiaEscudos;

import Context.Personagem;

/**
 *
 * @author Tiago
 */
public class EscudoNivel extends Escudo {
    int defesa;

    public EscudoNivel(int defesa) {
        this.defesa = defesa;
    }
    
    @Override
    public void processaDano(int dano, Personagem personagem){
        if (getSucessor() == null) {
            personagem.perdeNivelEnergia(dano - defesa);
            return;
        }
        
        if (dano <= 0){
           getSucessor().processaDano(0, personagem);
        } else {
           getSucessor().processaDano(dano - defesa, personagem);
        }
    }
}
