package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

public class PuloAlto implements Pular{

    @Override
    public void pular() {
        System.out.println("Pulo alto.");
    }
    
}