package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

public class PuloMedio implements Pular{

    @Override
    public void pular() {
        System.out.println("Pulo médio.");
    }
    
}
