package sistema;

public class Fornecedor extends Juridica{
    private String Produto;

    public Fornecedor(String id, String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, String produto) {
        super(id, nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        Produto = produto;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String produto) {
        Produto = produto;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Fornecedor: " +
                "\n Produto: '" + Produto + '\'' ;
    }
}
