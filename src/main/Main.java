package main;

import br.techcorp.funcionario.Funcionario;
import departamento.Departamento;

public class Main {
    public static void main(String[] args) {
        Departamento departamento = new Departamento("TI01","TI");
        departamento.adicionarFuncionario(new Funcionario("01","XX","Diretor",85000));
        departamento.adicionarFuncionario(new Funcionario("02","YY","Gerente",30000));
        departamento.adicionarFuncionario(new Funcionario("03","ZZ","Estagiario",1200));

        //exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());

        //desligar um funcionario
        departamento.removerFuncionarios("02");

        //exibir os dados do departamento
        System.out.println(departamento.exibirRelatorio());
    }
}
