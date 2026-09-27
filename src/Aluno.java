import java.util.List;
import java.util.ArrayList;

public class Aluno extends Pessoa implements Autenticavel{
    private List<Disciplina> matricula = new ArrayList<>();
    private Curso curso;
    public Aluno(String nome, int cpf, String email, Curso curso) {
        super(nome, cpf, email);
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public void exibirDados() {
        IO.println("aluno: " + this.getNome());
        IO.println("email: " + this.getEmail());
        IO.println("cpf: " + this.getCpf());
        IO.println("curso: " + this.getCurso().getNome());
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("321");
    }

    public void fazerMatricula(Disciplina disciplina) {
        this.matricula.add(disciplina);
    }

    public void cancelaMatricula(String nome) {
        if (!matricula.removeIf(disciplina -> disciplina.getNome().equals(nome))) {
            IO.println("aluno não matriculado!");
        }
    }

    public void listarMatriculas() {
        if (matricula.isEmpty()) {
            IO.println("aluno não matriculado!");
        } else {
            for (Disciplina disciplina : matricula) {
                IO.println(disciplina.getNome());
            }
        }
    }
}
