package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

public class MediaeImprime {
    public double mediaeImprime(double[] salario){
        double soma = salario[0] + salario[1] + salario[2];
        double media = soma / salario.length;
        return media;

    }
}
