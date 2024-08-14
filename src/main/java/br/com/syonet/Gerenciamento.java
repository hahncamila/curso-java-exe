package br.com.syonet;
import java.util.List;

public class Gerenciamento {

    void adicionarAluno(Aluno a);
    void removerAluno(String matricula);
    List<Aluno> listarAlunos();
    double calcularMedia();
    Aluno buscarAluno(String matricula);
    void atualizarNota(String matricula, double novaNota);
}