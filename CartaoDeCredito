public class CartaoDeCredito extends Pagamento {
	
    private String numeroCartao;

    public CartaoDeCredito(double valor, String data, String numeroCartao) {
        super(valor, data);
        setNumeroCartao(numeroCartao);
    }

    @Override
    public void Pagamentos() {
    	
        System.out.println("\n////////// Pagamento com Cartão ///////////");
        System.out.println("Número: " + getNumeroCartao());
        System.out.println("Valor: " + getValor() + "Reais.");
        System.out.println("Data: " + getData());
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        if (numeroCartao == null){
            throw new IllegalArgumentException("Numero inválido.");
        }
        this.numeroCartao = numeroCartao;
    }
}
