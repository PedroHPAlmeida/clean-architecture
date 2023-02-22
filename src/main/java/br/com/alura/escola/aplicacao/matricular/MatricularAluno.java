package br.com.alura.escola.aplicacao.matricular;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repossitorio;

    public MatricularAluno(RepositorioDeAlunos repossitorio) {
        this.repossitorio = repossitorio;
    }

    public void executa(MatricularAlunoDto dados) {
        Aluno aluno = dados.criarAluno();
        repossitorio.matricular(aluno);
    }

}
