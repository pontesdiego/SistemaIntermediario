package sistema;

import java.time.LocalDate;

public class PrestacaoServico extends Juridica{
    private LocalDate contratoInicio;
    private LocalDate contratoFim;

    public PrestacaoServico(String id, String nome, String telefone, String email, Endereco endereco, String cnpj, String inscricaoEstadual, LocalDate contratoInicio, LocalDate contratoFim) {
        super(id, nome, telefone, email, endereco, cnpj, inscricaoEstadual);
        this.contratoInicio = contratoInicio;
        this.contratoFim = contratoFim;
    }

    public LocalDate getContratoInicio() {
        return contratoInicio;
    }

    public void setContratoInicio(LocalDate contratoInicio) {
        this.contratoInicio = contratoInicio;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() +
                "PrestacaoServico: " +
                "  contrato de Inicio: " + contratoInicio +
                "  contrato Fim: " + contratoFim ;
    }
}
