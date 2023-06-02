package sistema;

public class Juridica extends Pessoa{
    protected String cnpj;
    protected String inscricaoEstadual;

    public Juridica(String id, String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual) {
        super(id, nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    @Override
    public String toString() {
        return "Juridica: " +
                super.toString() +
                "\n cnpj: '" + cnpj + '\'' +
                "\n inscrição Estadual: '" + inscricaoEstadual + '\'' ;
    }
}
