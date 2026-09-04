package Bank_System;

import java.util.Locale;

/**
 * Abstract base class representing a generic bank account.
 * Encapsulates common attributes (account number and balance) and operations (deposit and withdrawal).
 */
public abstract class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    /**
     * Withdraws a given amount if positive and sufficient funds are available.
     *
     * @param valor amount to withdraw
     */
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
            return;
        }

        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.printf(Locale.US, "Saque de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f%n", valor, this.saldo);
        } else {
            System.out.printf(Locale.US, "Erro: Saldo insuficiente para saque de R$ %.2f. Saldo atual: R$ %.2f%n", valor, this.saldo);
        }
    }

    /**
     * Deposits a positive amount into the account balance.
     *
     * @param valor amount to deposit
     */
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf(Locale.US, "Depósito de R$ %.2f realizado com sucesso. Novo saldo: R$ %.2f%n", valor, this.saldo);
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}