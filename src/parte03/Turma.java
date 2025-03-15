package parte03;

import java.util.ArrayList;

public class Turma {
    String nome;
    ArrayList<Aluno> alunos; //Relacionamento do tipo agregação

    public Turma(String nome, ArrayList<Aluno> alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }
}
