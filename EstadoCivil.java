package sistema;

public enum EstadoCivil {
    CASADO("Casado"),
    SOLTEIRO("Solteiro"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");

    protected final String texto;

    EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
