package Desafio;
import java.util.Scanner;

public class CalculadoraTerminal {
    public static void main(String[] args) {
        classSomas somas = new classSomas();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double num1 = sc1.nextDouble();
        System.out.println("Digite o segundo numero");
        double num2 = sc2.nextDouble();
        System.out.println("Qual o tipo de operação? / * - +");
        String tipoString = sc3.next();

        somas.setNum1(num1);
        somas.setNum2(num2);
        somas.setTipo(tipoString);
        double resultado = somas.equacoes(num1, num2);
        System.out.println("O resulatado é: "+resultado);
    }
}
