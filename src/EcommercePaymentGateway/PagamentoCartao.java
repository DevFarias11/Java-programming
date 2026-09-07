package EcommercePaymentGateway;

import java.util.Locale;

/**
 * Concrete payment strategy for credit card processing.
 */
public class PagamentoCartao implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser positivo.");
            return;
        }
        System.out.printf(Locale.US, "Pagamento de R$ %.2f processado via Cartão de Crédito com sucesso!%n", valor);
    }

    @Override
    public void estornar(String idTransacao) {
        if (idTransacao == null || idTransacao.trim().isEmpty()) {
            System.out.println("Erro: Identificador de transação inválido para estorno de cartão.");
            return;
        }
        System.out.println("ESTORNO DE TRANSAÇÃO DE CARTÃO REALIZADO! ID: " + idTransacao.trim() + " (Efetuado na fatura).");
    }
}
