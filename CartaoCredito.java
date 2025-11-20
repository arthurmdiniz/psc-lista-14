public class CartaoCredito implements MetodoPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito. Cobrança de 5% de taxa");
    }
    
}
