package sistema;

public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F'),
    MACHO("Macho", 'M');

    protected final String nome;
    protected final char caracter;

    Genero(String nome, char caracter) {
        this.nome = nome;
        this.caracter = caracter;
    }

    public String getNome() {
        return nome;
    }

    public char getCaracter() {
        return caracter;
    }
}
