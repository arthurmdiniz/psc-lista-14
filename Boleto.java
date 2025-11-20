public class Boleto implements MetodoPagamento {
    private String codigoBarra;

    public Boleto(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public String getCodigoBarras() {
        return codigoBarra;
    }
    
    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarra = codigoBarras;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Bolet. Boleto gerado e enviado por e-mail.");
    }
    
}
