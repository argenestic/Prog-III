import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double num1 = scan.nextDouble();

        System.out.println("Digite o segundo numero:");
        double num2 = scan.nextDouble();

        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtracao (-)");
        System.out.println("3 - Divisao (/)");
        System.out.println("4 - Multiplicacao (*)");
        int opcao = scan.nextInt();

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = num1 + num2;
                break;
            case 2:
                resultado = num1 - num2;
                break;
            case 3:
                resultado = num1 / num2;
                break;
            case 4:
                resultado = num1 * num2;
                break;
            default:
                System.out.println("Opcao invalida");
        }

        System.out.println("Resultado: " + resultado);

        scan.close();
    }
}
