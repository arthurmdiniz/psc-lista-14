public class TestePolimorfismo {
    public static void main(String[] args) {
        MetodoPagamento cartao = new CartaoCredito("1234-5678-9012-3456");
        MetodoPagamento boleto = new Boleto("34195.17515 23456.787128 34123.456005 2 10271000002603");
        MetodoPagamento pix = new Pix("joao.silva@gmail.com");

        System.out.println("Teste1 - Cartão:");
        ProcessadorPagamento.processar(cartao, 150.75);
        System.out.println("\nTeste2 - Boleto:");
        ProcessadorPagamento.processar(boleto, 499.00);
        System.out.println("\nTeste3 - Pix:");
        ProcessadorPagamento.processar(pix, 25.50);
    }
}
