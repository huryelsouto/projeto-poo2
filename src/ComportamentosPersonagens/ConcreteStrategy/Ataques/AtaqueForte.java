package ComportamentosPersonagens.ConcreteStrategy.Ataques;

import ComportamentosPersonagens.Strategy.Atacar;

/**
 *
 * Huryel Souto Costa - 12011BCC022 
 * Tiago da Silva e Souza Pinto - 12011BCC001
 */
public class AtaqueForte extends Atacar {
    private static AtaqueForte instancia = new AtaqueForte();

    private AtaqueForte() {
        setValorAtaque(30);
    }

    public static AtaqueForte getInstancia() {
        return instancia;
    }

    @Override
    public void atacar() {
        System.out.println("Ataque forte: " + getValorAtaque());
    }

}
