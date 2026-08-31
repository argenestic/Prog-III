class Contador {
    static int totalobjetos = 0;

    public Contador() {
        totalobjetos++;
    }

    static void mostrarTotal() {
        System.out.println(totalobjetos);
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();
        
        Contador.mostrarTotal();
    }
}