public class Ex8 {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Dom Casmurro", 39.90, "Machado de Assis", "1111");
        produtos[1] = new CD("Legend", 29.90, 10, "2222");
        produtos[2] = new DVD("Matrix", 24.90, 136, "3333");
        produtos[3] = new Livro("O Hobbit", 45.00, "J.R.R. Tolkien", "4444");
        produtos[4] = new CD("Thriller", 34.90, 9, "5555");

        System.out.println("=== Produtos da loja ===");
        for (Produto p : produtos) {
            System.out.println(p);
        }

        Produto produtoEscolhido = produtos[1];

        Produto copiaMesmoCodigo = new CD("Legend", 29.90, 10, "2222");
        Produto copiaCodigoDiferente = new CD("Legend", 29.90, 10, "9999");

        System.out.println("\n=== Buscas ===");
        System.out.println("Buscando copia com mesmo codigo:");
        buscarProduto(produtos, copiaMesmoCodigo);

        System.out.println("Buscando copia com codigo diferente:");
        buscarProduto(produtos, copiaCodigoDiferente);
    }

    public static void buscarProduto(Produto[] produtos, Produto alvo) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].equals(alvo)) {
                System.out.println("Produto encontrado na posicao " + i);
                return;
            }
        }
        System.out.println("Produto nao encontrado no vetor");
    }
}

class Produto {
    String nome;
    double preco;
    String codigoBarras;

    public Produto(String nome, double preco, String codigoBarras) {
        this.nome = nome;
        this.preco = preco;
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preco: R$" + preco + ", Codigo: " + codigoBarras;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o.getClass() != this.getClass()) {
            return false;
        } else if (!((Produto) o).getCodigoBarras().equals(this.getCodigoBarras())) {
            return false;
        } else {
            return true;
        }
    }
}

class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String autor, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    public DVD(String nome, double preco, int duracao, String codigoBarras) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duracao: " + duracao + " min";
    }
}
