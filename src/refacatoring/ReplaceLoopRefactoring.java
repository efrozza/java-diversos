package refacatoring;


import streams.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceLoopRefactoring {

    public static void main(String[] args) {

        Aluno everton = new Aluno("Everton", 10);
        Aluno maria = new Aluno("Maria", 7);

        List<Aluno> alunos = new ArrayList<>();

        alunos.add(everton);
        alunos.add(maria);

        // antes de refatorar
        System.out.println("Pre refactor");

        List<Aluno> alunosAprovados = new ArrayList<>();

        for (Aluno aluno : alunos) {
            if (aluno.nota > 7) {
                alunosAprovados.add(aluno);
                System.out.println(aluno.nome);
            }
        }

        System.out.println("Apos refactor");

        List<Aluno> alunosAprovadosStream = alunos.stream()
                .filter(aluno -> aluno.nota > 7)
                .collect(Collectors.toList());

        alunosAprovadosStream.forEach(e -> System.out.println(e.nome));


    }
}
