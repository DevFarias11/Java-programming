package InterfaceCalculator;

public class Calculadora implements Calculos {

    public Calculadora() {
    }

    @Override
    public Double soma(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtracao(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiplicacao(Double a, Double b) {
        return a * b;
    }
}