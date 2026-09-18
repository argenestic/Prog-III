public class Ex2 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Joao", 20, "2024001");
        aluno1.exibirDados();
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Aluno extends Pessoa {
    String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }
}
