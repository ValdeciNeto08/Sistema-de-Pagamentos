public class BoletoBancario extends Pagamento {
	
    private String codigoBarras;

    public BoletoBancario(double valor, String data, String codigoBarras) {
        super(valor, data);
        setCodigoBarras(codigoBarras);
    }

    @Override
    public void Pagamentos() {
        System.out.println("\n///////// Pagamento com Boleto ////////");
        System.out.println("Código: " + getCodigoBarras());
        System.out.println("Valor: " + getValor() + "Reais");
        System.out.println("Data: " + getData());
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        if (codigoBarras == null) {
            throw new IllegalArgumentException("Código de barras inválido.");
        }
        this.codigoBarras = codigoBarras;
    }
}
