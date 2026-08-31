import java.util.ArrayList;
import java.util.Iterator;

public class Exercicio3 {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");
        alunos.add("Daniela");
        alunos.add("Eduardo");

        Iterator<String> it = alunos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        alunos.remove("Carlos");

        System.out.println();
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
    }
}