package Desafio;
import java.util.Scanner;

public class CalculadoraTerminal {
    public static void main(String[] args) {
        classSomas somas = new classSomas();
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("operation type % / * - +");
        String tipoString = sc3.next();
        System.out.println("Write the first number");
        double num1 = sc1.nextDouble();
        System.out.println("Write the second number");
        double num2 = sc2.nextDouble();


        somas.setNum1(num1);
        somas.setNum2(num2);
        somas.setTipo(tipoString);
        double resultado = somas.equacoes(num1, num2);
        System.out.println("the result is: "+resultado);
    }
}
