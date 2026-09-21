public class Ex3 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Maria", 22, "2024002");

        System.out.println("Dados iniciais:");
        aluno1.exibirDados();

        aluno1.setNome("Maria Silva");
        aluno1.setIdade(23);
        aluno1.setMatricula("2024099");

        System.out.println("\nDados apos alteracao:");
        aluno1.exibirDados();

        System.out.println("\nUsando os gets:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matricula: " + aluno1.getMatricula());
    }
}

class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }
}
