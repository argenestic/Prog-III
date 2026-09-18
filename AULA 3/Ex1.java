public class Ex1 {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");

        System.out.println("Livro 1:");
        livro1.exibirDados();

        System.out.println("\nLivro 2:");
        livro2.exibirDados();
    }
}

class Livro {
    String titulo;
    String autor;

    public Livro() {
        this.titulo = "Sem titulo";
        this.autor = "Autor desconhecido";
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirDados() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
