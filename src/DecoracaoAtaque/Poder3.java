/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoracaoAtaque;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * @author Tiago
 */
public class Poder3 extends AtaqueDecorator {
    public Poder3(Atacar ataqueDecorado) {
       super(ataqueDecorado);
       setValorAtaque(10);
    }
}
