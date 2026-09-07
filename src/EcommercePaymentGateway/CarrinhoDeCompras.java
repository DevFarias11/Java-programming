package EcommercePaymentGateway;

/**
 * Context class representing an e-commerce shopping cart.
 * Applies the Strategy design pattern by delegating payment processing to a {@link MetodoPagamento}.
 */
public class CarrinhoDeCompras {

    private MetodoPagamento metodo;

    public CarrinhoDeCompras() {
    }

    public CarrinhoDeCompras(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public void definirMetodo(MetodoPagamento metodo) {
        this.metodo = metodo;
    }

    public MetodoPagamento getMetodo() {
        return metodo;
    }

    public void finalizarCompra(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor da compra deve ser maior que zero.");
            return;
        }

        if (this.metodo != null) {
            this.metodo.processarPagamento(valor);
        } else {
            System.out.println("Erro: Selecione um método de pagamento antes de finalizar a compra!");
        }
    }
}
