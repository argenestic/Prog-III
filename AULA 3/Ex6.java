public class Ex6 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1001);
        ContaBancaria conta2 = new ContaBancaria(1001);
        ContaBancaria conta3 = new ContaBancaria(1002);

        System.out.println("conta1 equals conta2? " + conta1.equals(conta2));
        System.out.println("conta1 equals conta3? " + conta1.equals(conta3));

        System.out.println(conta1);
    }
}

class ContaBancaria {
    private int numero;

    public ContaBancaria(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
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
        } else if (((ContaBancaria) o).getNumero() != this.getNumero()) {
            return false;
        } else {
            return true;
        }
    }
}
