public abstract class Pagamento {
	
    private double valor;
    private String data;

    public Pagamento(double valor, String data) {
        setValor(valor);
        setData(data);
    }

    
    public abstract void Pagamentos();

    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido.");
        }
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data == null) {
            throw new IllegalArgumentException("Data inválida.");
        }
        this.data = data;
    }
}
