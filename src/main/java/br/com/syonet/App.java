package br.com.syonet;

public class App {
    public static void main(String[] args) {
        Gerenciamento gerenciamento = new Turma();
        gerenciamento.adicionarAluno(new Aluno("Camila", "123", 8));
        gerenciamento.adicionarAluno(new Aluno("Lais", "1234", 6));
        gerenciamento.adicionarAluno(new Aluno("Joana", "12345", 7));
        gerenciamento.adicionarAluno(new Aluno("João", "123456", 6));

        System.out.println("Alunos: " + gerenciamento.listarAlunos());
        System.out.println(String.format("Média das notas: %.2f", gerenciamento.calcularMedia()));

        Aluno aluno = gerenciamento.buscarAluno("123");

        if (aluno != null) {
            System.out.println("Aluno identificado: " + aluno);
        } else {
            System.out.println("Aluno não identificado");
        }

        System.out.println("Atualizando nota do aluno com matrícula '123' para 10.");
        gerenciamento.atualizarNota("123", 10);

        System.out.println("Lista de alunos após atualização: " + gerenciamento.listarAlunos());
        System.out.println(String.format("Média das notas dos alunos atualizada: %.2f", gerenciamento.calcularMedia()));
    }
}