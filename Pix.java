public class Pix implements MetodoPagamento {
    private String chavePix;
    
    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Pix. Transação instantânea.");
    }   
}
