package br.com.alura;

import br.com.alura.escola.aplicacao.matricular.MatricularAluno;
import br.com.alura.escola.aplicacao.matricular.MatricularAlunoDto;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class Main {

    public static void main( String[] args ) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "fulano@email.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(new MatricularAlunoDto(nome, cpf, email));
    }

}
