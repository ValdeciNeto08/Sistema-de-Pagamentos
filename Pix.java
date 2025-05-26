public class Pix extends Pagamento {
	
    private String chavePix;

    public Pix(double valor, String data, String chavePix) {
        super(valor, data);
        setChavePix(chavePix);
    }

    @Override
    public void Pagamentos() {
        System.out.println("\n/////// Pagamento com PIX ////////");
        System.out.println("Chave pix: " + getChavePix());
        System.out.println("Valor: R$" + getValor());
        System.out.println("Data: " + getData());
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        if (chavePix == null) {
            throw new IllegalArgumentException("Chave PIX inválida.");
        }
        this.chavePix = chavePix;
    }
}
