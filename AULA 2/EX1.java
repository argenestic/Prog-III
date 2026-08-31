class Carro {
    String marca;
    String modelo;
    int ano;

    void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}

public class TestaCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2023;

        carro1.exibirInfo(); 
        carro2.exibirInfo(); 
    }
}