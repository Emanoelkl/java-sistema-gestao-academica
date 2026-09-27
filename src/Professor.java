public class Professor extends Pessoa implements Autenticavel{
    private int registro;
    private String areaAtuacao;
    public Professor(String nome, int cpf, String email, int registro, String areaAtuacao) {
        super(nome, cpf, email);
        this.registro = registro;
        this.areaAtuacao = areaAtuacao;
    }

    public String getAreAtuacao() {
        return areaAtuacao;
    }

    public void setAreAtuacao(String areAtuacao) {
        this.areaAtuacao = areAtuacao;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    @Override
    public void exibirDados() {
        IO.println("professor: " + this.getNome());
        IO.println("email: " + this.getEmail());
        IO.println("cpf: " + this.getCpf());
        IO.println("registro: " + this.getRegistro());
        IO.println("Area de atuação: " + this.getAreAtuacao());
    }

    @Override
    public boolean autenticar(String senha) {
        return senha.equals("123");
    }
}
