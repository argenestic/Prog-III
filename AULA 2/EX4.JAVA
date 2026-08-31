public class Exercicio4 {
    public static void main(String[] args) {
        String frase = "Programação Orientada a Objetos com Java";
        
        String fraseTratada = frase.trim();
        
        System.out.println(fraseTratada.length());
        
        System.out.println(fraseTratada.toUpperCase());
        
        System.out.println(fraseTratada.replace("Java", "Linguagem Java"));
        
        System.out.println(fraseTratada.charAt(5));
    }
}