package Bank_System;

import java.util.Locale;

/**
 * Represents a checking account (Conta Corrente) with an operational fee (taxa de operação).
 * Inherits from ContaBancaria and implements Imprimivel.
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int numeroConta, double saldo, double taxaDeOperacao) {
        super(numeroConta, saldo);
        this.taxaDeOperacao = taxaDeOperacao;
    }

    @Override
    public void mostrarDados() {
        System.out.println("================ CONTA CORRENTE ================");
        System.out.println("Número da Conta  : " + getNumeroConta());
        System.out.printf(Locale.US, "Saldo Atual      : R$ %.2f%n", getSaldo());
        System.out.printf(Locale.US, "Taxa de Operação : R$ %.2f%n", this.taxaDeOperacao);
        System.out.println("================================================");
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
}