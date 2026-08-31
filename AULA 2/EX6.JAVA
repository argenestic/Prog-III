import java.util.ArrayList;
import java.util.Iterator;

class ContaBancaria {
    int numero;
    String titular;
    double saldo;
}

public class Exercicio6 {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        
        ContaBancaria c1 = new ContaBancaria();
        c1.numero = 101; c1.titular = "Marcos"; c1.saldo = 1500.0;
        
        ContaBancaria c2 = new ContaBancaria();
        c2.numero = 102; c2.titular = "Julia"; c2.saldo = 2500.0;
        
        ContaBancaria c3 = new ContaBancaria();
        c3.numero = 103; c3.titular = "Fernando"; c3.saldo = 800.0;
        
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        
        double saldoTotal = 0;
        Iterator<ContaBancaria> it = contas.iterator();
        
        while (it.hasNext()) {
            ContaBancaria conta = it.next();
            System.out.println(conta.numero + " - " + conta.titular);
            saldoTotal += conta.saldo;
        }
        
        System.out.println("Saldo total: " + saldoTotal);
    }
}