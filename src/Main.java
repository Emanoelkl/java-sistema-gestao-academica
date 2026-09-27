import java.util.List;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Francis", 1234, "francis@ulbra", 1, "java");
        Professor prof2 = new Professor("Victor", 4321, "victor@ulbra", 2, "js");
        Disciplina dis1 = new Disciplina(1, "Poo", "40 horas");
        Disciplina dis2 = new Disciplina(2, "back", "40 horas");
        Disciplina dis3 = new Disciplina(3, "dados", "10 horas");
        Curso curso1 = new Curso(001, "ADS");
        dis1.setProfessor(prof1);
        dis2.setProfessor(prof2);
        dis3.setProfessor(prof2);
        curso1.addDisciplina(dis1);
        curso1.addDisciplina(dis2);
        curso1.addDisciplina(dis3);
        Aluno aluno1 = new Aluno("EManoel", 567, "emanoel@ulbra", curso1);
        Aluno aluno2 = new Aluno("Lucas", 765, "lucas@ulbra", curso1);
        Aluno aluno3 = new Aluno("Leticia", 67, "leticia@ulbra", curso1);
        aluno1.fazerMatricula(dis1);
        aluno1.fazerMatricula(dis2);
        aluno2.fazerMatricula(dis2);
        aluno2.fazerMatricula(dis3);
        aluno3.fazerMatricula(dis3);
        aluno1.exibirDados();
        aluno2.exibirDados();
        aluno3.exibirDados();
        prof1.exibirDados();
        prof2.exibirDados();
        curso1.listarDisciplinas();
        aluno1.listarMatriculas();
        if(aluno1.autenticar("123")) {
            IO.println("Senha correta, bom dia " + aluno1.getNome());
        } else {
            IO.println("Senha incorreta");
        }
        if(prof1.autenticar("123")) {
            IO.println("Senha correta, bom dia professor " + prof1.getNome());
        } else {
            IO.println("Senha incorreta");
        }
        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(aluno1);
        pessoas.add(aluno2);
        pessoas.add(prof1);

        for (Pessoa pessoa : pessoas) {
            pessoa.exibirDados();
        }
        Universidade uni1 = new Universidade("Ulbra");
        uni1.addAluno(aluno1);
        uni1.addCurso(curso1);
        uni1.addProfessor(prof1);
        IO.println(uni1.getNome());
        uni1.listarAlunos();
        uni1.listarCursos();
        uni1.listarProfessores();
    }
}