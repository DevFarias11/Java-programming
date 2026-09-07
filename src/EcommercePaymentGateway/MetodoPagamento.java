package EcommercePaymentGateway;

/**
 * Strategy interface defining the contract for e-commerce payment methods.
 * Concrete payment processors must implement processing and refund operations.
 */
public interface MetodoPagamento {

    /**
     * Processes a payment transaction of the specified amount.
     *
     * @param valor amount to be processed
     */
    void processarPagamento(double valor);

    /**
     * Refunds a previously processed transaction.
     *
     * @param idTransacao unique identifier of the transaction to refund
     */
    void estornar(String idTransacao);
}
