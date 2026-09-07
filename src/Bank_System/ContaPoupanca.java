package Bank_System;

import java.util.Locale;

/**
 * Represents a savings account (Conta Poupança) with a credit/overdraft limit (limite).
 * Inherits from ContaBancaria and implements Imprimivel.
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel {

    private double limite;

    public ContaPoupanca() {
    }

    public ContaPoupanca(int numeroConta, double saldo, double limite) {
        super(numeroConta, saldo);
        this.limite = limite;
    }

    @Override
    public void mostrarDados() {
        System.out.println("================ CONTA POUPANÇA ================");
        System.out.println("Número da Conta  : " + getNumeroConta());
        System.out.printf(Locale.US, "Saldo Atual      : R$ %.2f%n", getSaldo());
        System.out.printf(Locale.US, "Limite de Crédito: R$ %.2f%n", this.limite);
        System.out.println("================================================");
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}