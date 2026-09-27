import java.util.List;
import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();
    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void addDisciplina(Disciplina disciplina) {
        this.disciplinas.add(disciplina);
    }

    public void deletaDisciplina(String nome) {
        if (!disciplinas.removeIf(disciplina -> disciplina.getNome().equals(nome))) {
            IO.println("disciplina não encontrada!");
        }
    }

    public void listarDisciplinas() {
        if (disciplinas.isEmpty()) {
            IO.println("Nenhuma disciplina no momento!");
        } else {
            for (Disciplina disciplina : disciplinas) {
                IO.println(disciplina.getNome());
            }
        }
    }
}
