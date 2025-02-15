package academy.devdojo.maratonajava.javacore.calculadora.dominio.Test;

public class TestCalculadora {
    public static void main(String[] args) {
        domain calc = new domain();
        calc.pegarOsValores();
        System.out.println(calc.Calculo());
    }
}
