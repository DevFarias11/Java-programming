package EcommercePaymentGateway;

import java.util.Locale;

/**
 * Concrete payment strategy for instant PIX transfers.
 */
public class PagamentoPix implements MetodoPagamento {

    @Override
    public void processarPagamento(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do pagamento deve ser positivo.");
            return;
        }
        System.out.printf(Locale.US, "Pagamento de R$ %.2f recebido via Pix com sucesso!%n", valor);
    }

    @Override
    public void estornar(String idTransacao) {
        if (idTransacao == null || idTransacao.trim().isEmpty()) {
            System.out.println("Erro: Identificador de transação inválido para estorno de Pix.");
            return;
        }
        System.out.println("PEDIDO DE ESTORNO PIX REALIZADO! ID: " + idTransacao.trim() + ".");
    }
}
