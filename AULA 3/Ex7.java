import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Conta c = null;
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("Qual tipo de conta deseja criar para Jose?");
        System.out.println("1 - Conta");
        System.out.println("2 - Conta especial");
        System.out.println("3 - Conta poupanca");
        opcao = scan.nextInt();

        switch (opcao) {
            case 1:
                c = new Conta(1, "Jose");
                break;
            case 2:
                c = new ContaEspecial(1, "Jose", 100.00);
                break;
            case 3:
                c = new ContaPoupanca(1, "Jose");
                break;
        }

        c.imprimirTipoConta();

        System.out.println();
        System.out.println("Produtos da loja");

        Produto[] produtos = new Produto[5];
        produtos[0] = new Livro("Dom Casmurro", 39.90, "Machado de Assis");
        produtos[1] = new CD("Legend", 29.90, 10);
        produtos[2] = new DVD("Matrix", 24.90, 136);
        produtos[3] = new Livro("O Hobbit", 45.00, "J.R.R. Tolkien");
        produtos[4] = new CD("Thriller", 34.90, 9);

        for (Produto p : produtos) {
            System.out.println(p);
        }

        scan.close();
    }
}

class Conta {
    private int numero;
    private String nome_titular;
    protected double saldo;

    public Conta(int numero, String nome_titular, double saldo) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        this.saldo = saldo;
    }

    public Conta(int numero, String nome_titular) {
        this.numero = numero;
        this.nome_titular = nome_titular;
        saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;
    }

    public boolean sacar(double valor) {
        if (this.getSaldo() >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome_titular() {
        return nome_titular;
    }

    public void setNome_titular(String nome_titular) {
        this.nome_titular = nome_titular;
    }

    public void imprimirTipoConta() {
        System.out.println("Conta Comum");
    }

    @Override
    public String toString() {
        return ("Conta: " + this.numero);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } else if (o.getClass() != this.getClass()) {
            return false;
        } else if (((Conta) o).getNumero() != this.getNumero()) {
            return false;
        } else {
            return true;
        }
    }
}

class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numero, String nome_titular, double limite) {
        super(numero, nome_titular);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor <= this.limite + this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Especial");
    }
}

class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String nome_titular) {
        super(numero, nome_titular);
    }

    public void reajustar(double percentual) {
        double saldoAtual = this.getSaldo();
        double reajuste = saldoAtual * percentual;
        this.depositar(reajuste);
    }

    @Override
    public void imprimirTipoConta() {
        System.out.println("Conta Poupanca");
    }
}

class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preco: R$" + preco;
    }
}

class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor;
    }
}

class CD extends Produto {
    int numeroFaixas;

    public CD(String nome, double preco, int numeroFaixas) {
        super(nome, preco);
        this.numeroFaixas = numeroFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Faixas: " + numeroFaixas;
    }
}

class DVD extends Produto {
    int duracao;

    public DVD(String nome, double preco, int duracao) {
        super(nome, preco);
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Duracao: " + duracao + " min";
    }
}
