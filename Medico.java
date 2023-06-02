package sistema;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private String crm;

    public Medico(String id, String nome, String telefone, String email, Endereco endereco, Genero genero, EstadoCivil estadocivil, LocalDate dataNascimento, String cpf, String rg, String matricula, Setor setor, double salario, String crm) {
        super(id, nome, telefone, email, endereco, genero, estadocivil, dataNascimento, cpf, rg, matricula, setor, salario);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "Medico: " +
                super.toString() +
                "crm: '" + crm + '\'' ;
    }
}
