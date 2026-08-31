class Produto {
    int id;
    String nome;
    double preco;

    void aplicarDesconto(double porcentagem) {
        preco -= preco * (porcentagem / 100);
    }

    void exibirDetalhes() {
        System.out.printf("ID: %d | Nome: %s | Preço: %.2f\n", id, nome, preco);
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.id = 1;
        p1.nome = "Monitor";
        p1.preco = 1000.0;

        Produto p2 = new Produto();
        p2.id = 2;
        p2.nome = "Teclado";
        p2.preco = 200.0;

        p1.aplicarDesconto(10);
        p2.aplicarDesconto(15);

        p1.exibirDetalhes();
        p2.exibirDetalhes();
    }
}