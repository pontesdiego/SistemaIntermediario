package sistema;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Pessoa person = new Advogado("939546", "Diego", "(71) 985226776", "diegopontes30.04@gmail",
                new Endereco("vista alegre", "134566", "bloco 90", "407992", "Salvador", UnidadeFederativa.BAHIA),
                Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2017, Month.AUGUST, 30),
                 "6666666", "8484564", "93920454", Setor.JURIDICO, 5.900, "15590");

        Pessoa persona = new Fornecedor("939546", "Kakashi", "(71) 985226776", "Kakashi345@gmail",
                new Endereco("vista alegre", "134566", "bloco 90", "407992", "Salvador", UnidadeFederativa.BAHIA),
                "537584-89", "8749365547", "Playstation 5");

        Pessoa personita = new Engenheiro("16463", "Wiakisoba", "(71) 9774854243", "Wiakisoba@gmail",
                new Endereco("Joana angis", "134566", "bloco 932", "32765686", "Pururuca", UnidadeFederativa.RIO_DE_JANEIRO),
                Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2000, Month.AUGUST, 22),
                "6666666", "8484564", "93920454", Setor.JURIDICO, 5.900, "15590");

        System.out.println(person);

        System.out.println("");

        System.out.println(persona);

        System.out.println("");

        System.out.println(personita);
    }
}
