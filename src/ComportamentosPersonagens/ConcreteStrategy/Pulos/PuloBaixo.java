package ComportamentosPersonagens.ConcreteStrategy.Pulos;
import ComportamentosPersonagens.Strategy.Pular;

public class PuloBaixo implements Pular{

    @Override
    public void pular() {
        System.out.println("Pulo baixo.");
    }
    
}
