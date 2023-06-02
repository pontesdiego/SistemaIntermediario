package sistema;

import java.time.LocalDate;
import java.time.Period;

public abstract class Fisica extends Pessoa{
    protected Genero genero;
    protected EstadoCivil estadocivil;
    protected LocalDate dataNascimento;

    public Fisica(String id, String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento) {
        super(id, nome, telefone, email, endereco);
        this.genero = genero;
        this.estadocivil = estadocivil;
        this.dataNascimento = dataNascimento;
    }

    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return super.toString() +
                "" +
                "\n genero: " + genero.getNome() +
                "\n estadocivil: " + estadocivil.getTexto() +
                "\n Data de Nascimento: " + dataNascimento +
                "\n Idade: " + getIdade();
    }
}
