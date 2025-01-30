package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = carro;

        carro.ano = 2006;
        carro.modelo = "Turbo";
        carro.nome = "Civic";

        carro2.modelo = "economic";
        carro2.ano = 2009;
        carro2.nome = "Fiat";

        System.out.println("o carro é: "+carro.nome+" "+carro.ano+" "+carro.modelo +" e o segundo carro é: "+carro2.nome+" "+carro2.ano+" "+carro2.modelo);
    }
}