package academy.devdojo.maratonajava.introducao;

public class oparitm {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        double numero02 = 20;
        double s = numero01 / numero02;
        System.out.println(s);

        // %
        int resto = 21 % 2;
        System.out.println(resto);

        // < > <=  >=  == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAvinte = 10 == 20;
        boolean isDezIgualAdez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte = "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = "+isDezMenorQueVinte);
        System.out.println("isDezIgualAvinte = "+isDezIgualAvinte);
        System.out.println("isDezIgualAdez = "+isDezIgualAdez);
        System.out.println("isDezDiferenteDeDez = "+isDezDiferenteDeDez);

        //operadores logicos:
        //&& (AND), || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta = "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta = "+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 6000;
        double valorTotalContaPoupanca = 3000;

        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel = "+isPlaystationCincoCompravel);

        // =, +=, -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(++contador2);

    }
}