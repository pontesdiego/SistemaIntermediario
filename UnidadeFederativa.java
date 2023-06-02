package sistema;

public enum UnidadeFederativa {
    BAHIA("Bahia", "BA"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ"),
    SAO_PAULO("São paulo", "SP");

    protected final String nome;
    protected final String sigla;

    UnidadeFederativa(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
}
