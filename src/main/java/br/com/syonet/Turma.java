package br.com.syonet;

import java.util.ArrayList;
import java.util.List;

public class Turma implements Gerenciamento {
    private List<Aluno> alunos = new ArrayList<>();

    @Override
    public void adicionarAluno(Aluno aluno) {
        if (buscarAluno(aluno.getMatricula()) != null) {
            System.out.println("Não é possível adicionar aluno com um número de matrícula que já existe: " + aluno.getMatricula());
            return;
        }
        alunos.add(aluno);
    }

    @Override
    public void removerAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                break;
            }
        }
    }

    @Override
    public List<Aluno> listarAlunos() {
        return new ArrayList<>(alunos);
    }

    @Override
    public double calcularMedia() {
        if (alunos.isEmpty()) return 0.0;
        double somaNotas = 0.0;
        for (Aluno aluno : alunos) {
            somaNotas += aluno.getNota();
        }
        return somaNotas / alunos.size();
    }

    @Override
    public Aluno buscarAluno(String matricula) {
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;
    }

    @Override
    public void atualizarNota(String matricula, double novaNota) {
        Aluno aluno = buscarAluno(matricula);
        if (aluno != null) {
            aluno.setNota(novaNota);
        }
    }
}