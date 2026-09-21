import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o inicio do intervalo:");
        int inicio = scan.nextInt();

        System.out.println("Digite o fim do intervalo:");
        int fim = scan.nextInt();

        System.out.println("Numeros primos entre " + inicio + " e " + fim + ":");

        for (int numero = inicio; numero <= fim; numero++) {
            if (ehPrimo(numero)) {
                System.out.println(numero);
            }
        }

        scan.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
