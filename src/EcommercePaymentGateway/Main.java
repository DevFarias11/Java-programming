package EcommercePaymentGateway;

/**
 * Application entry point demonstrating the Strategy pattern implementation
 * with dynamic payment switching, transaction refunds, and defensive edge-case handling.
 */
public class Main {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        System.out.println("==== COMPRA 1 (PIX) ====");
        carrinho.definirMetodo(new PagamentoPix());
        carrinho.finalizarCompra(150.00);

        System.out.println("\n==== COMPRA 2 (CARTÃO DE CRÉDITO) ====");
        carrinho.definirMetodo(new PagamentoCartao());
        carrinho.finalizarCompra(550.00);

        System.out.println("\n===== TESTE DE ESTORNOS =====");
        MetodoPagamento pix = new PagamentoPix();
        pix.estornar("TX-59509");

        MetodoPagamento cartao = new PagamentoCartao();
        cartao.estornar("TX-CARTAO-88412");

        System.out.println("\n===== CENÁRIO DEFENSIVO (SEM MÉTODO DEFINIDO) =====");
        CarrinhoDeCompras carrinhoSemMetodo = new CarrinhoDeCompras();
        carrinhoSemMetodo.finalizarCompra(100.00);
    }
}
