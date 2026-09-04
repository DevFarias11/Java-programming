package Bank_System;

/**
 * Application entry point for demonstrating the banking system and polymorphic reporting.
 */
public class Executavel {

    public Executavel() {
    }

    public static void main(String[] args) {
        System.out.println("---------- INICIANDO SISTEMA BANCÁRIO ----------\n");

        // 1. Instanciando e configurando Conta Corrente
        ContaCorrente cc = new ContaCorrente();
        cc.setNumeroConta(157);
        cc.setSaldo(5600.00);
        cc.setTaxaDeOperacao(25.20);

        // 2. Instanciando e configurando Conta Poupança
        ContaPoupanca cp = new ContaPoupanca();
        cp.setNumeroConta(159);
        cp.setSaldo(500.57);
        cp.setLimite(1500.00);

        // 3. Executando operações bancárias
        System.out.println("--- Testando Operações ---");
        cc.depositar(250.00);
        cp.sacar(250.00);

        // 4. Demonstração de Polimorfismo através do Relatório
        Relatorio relatorio = new Relatorio();
        relatorio.gerarRelatorio(cc);
        relatorio.gerarRelatorio(cp);

        System.out.println("\n---------- OPERAÇÕES FINALIZADAS COM SUCESSO ----------");
    }
}