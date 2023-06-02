package sistema;

import java.time.LocalDate;

public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String id, String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crea) {
        super(id, nome, telefone, email, endereco, genero, estadocivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "Engenheiro: " +
                super.toString() +
                "\n crea: '" + crea + '\'' ;
    }
}
