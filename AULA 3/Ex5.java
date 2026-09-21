public class Ex5 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int soma1 = calc.somar(2, 3);
        double soma2 = calc.somar(2.5, 3.5);
        int soma3 = calc.somar(1, 2, 3);

        System.out.println("Soma de 2 inteiros: " + soma1);
        System.out.println("Soma de 2 doubles: " + soma2);
        System.out.println("Soma de 3 inteiros: " + soma3);
    }
}

class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }
}
