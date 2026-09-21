public class Ex3 {
    public static void main(String[] args) {
        int quantidade = 30;
        int anterior = 1;
        int atual = 1;

        System.out.println("Sequencia de Fibonacci:");

        for (int i = 1; i <= quantidade; i++) {
            if (i == 1 || i == 2) {
                System.out.println(1);
            } else {
                int proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
                System.out.println(atual);
            }
        }
    }
}
