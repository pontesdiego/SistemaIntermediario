package sistema;

import java.time.LocalDate;

public class Advogado extends Funcionario{
    private String oab;

    public Advogado(String id, String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String oab) {
        super(id, nome, telefone, email, endereco, genero, estadocivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    @Override
    public String toString() {
        return "Advogado: " +
                super.toString() +
                "\n oab: '" + oab + '\'' ;
    }
}
