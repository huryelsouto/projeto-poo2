/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoracaoAtaque;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */

public class AtaqueDecorator extends Atacar {
    private Atacar ataqueDecorado;

    public AtaqueDecorator(Atacar ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }
    
    @Override
    public int getValorAtaque() {
        return ataqueDecorado.getValorAtaque() + super.getValorAtaque();
    }
    
    @Override
    public void atacar() {
        System.out.println("Ataque Decorado: " + getValorAtaque()); 
    }
    
}
