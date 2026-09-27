import java.util.List;
import java.util.ArrayList;

public class Universidade {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Professor> professores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    public Universidade(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public void removeAluno(String nome) {
        if (!alunos.removeIf(aluno -> aluno.getNome().equals(nome))) {
            IO.println("aluno não encontrado!");
        }
    }

    public void listarAlunos() {
        if (alunos.isEmpty()) {
            IO.println("Nenhum aluno no momento!");
        } else {
            for (Aluno aluno : alunos) {
                IO.println(aluno.getNome());
            }
        }
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }

    public void removeProfessor(String nome) {
        if (!professores.removeIf(professor -> professor.getNome().equals(nome))) {
            IO.println("professor não encontrado!");
        }
    }

    public void listarProfessores() {
        if (professores.isEmpty()) {
            IO.println("Nenhum professor no momento!");
        } else {
            for (Professor professor : professores) {
                IO.println(professor.getNome());
            }
        }
    }

    public void addCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void removeCurso(String nome) {
        if (!cursos.removeIf(curso -> curso.getNome().equals(nome))) {
            IO.println("curso não encontrado!");
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            IO.println("Nenhum curso no momento!");
        } else {
            for (Curso curso : cursos) {
                IO.println(curso.getNome());
            }
        }
    }
}
