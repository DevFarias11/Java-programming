package InterfaceCalculator;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        Double valor1 = 15.0;
        Double valor2 = 5.0;

        Double resultadoSoma = calculadora.soma(valor1, valor2);
        Double resultadoSubtracao = calculadora.subtracao(valor1, valor2);
        Double resultadoMultiplicacao = calculadora.multiplicacao(valor1, valor2);

        System.out.println("--------- INICIANDO CALCULADORA ---------");
        System.out.println("Esses sao os valores: " + valor1 + " e " + valor2);
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtracao: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicacao: " + resultadoMultiplicacao);
    }
}