import java.util.ArrayList;
import java.util.Iterator;

public class CadastroPessoa {
    
    static boolean validarNome(String nome) {
        if (nome != null && !nome.trim().isEmpty() && nome.trim().length() >= 3) {
            return true;
        }
        return false;
    }

    static boolean buscarUsuario(ArrayList<String> lista, String busca) {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(busca)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<String> usuarios = new ArrayList<>();
        
        String[] tentativas = {"Pedro", "A", "   ", "Mariana", "Lucas", "Tiago"};
        
        for (String nome : tentativas) {
            if (validarNome(nome)) {
                usuarios.add(nome);
            }
        }
        
        boolean achou = buscarUsuario(usuarios, "lucas");
        System.out.println(achou);
    }
}