package academy.devdojo.maratonajava.javacore.calculadora.dominio.Test;

import java.util.Objects;
import java.util.Scanner;

public class domain {
    private double num1;
    private double num2;
    private String dec;
    private String dec2;

    public void pegarOsValores(){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Qual o tipo de operação deseja realizar? + - * / %");
        dec = sc1.next();
        System.out.println("numero 1: ");
        num1 = sc2.nextDouble();
        System.out.println("Numero 2: ");
        num2 = sc3.nextDouble();
    }

    public double Calculo(){
        Scanner scanner2 = new Scanner(System.in);
        if (Objects.equals(dec, "+")){
            return num1 + num2;
        } else if (Objects.equals(dec, "-")) {
            return num1 - num2;
        } else if (Objects.equals(dec, "*")) {
            return num1 * num2;
        } else if (Objects.equals(dec, "/")) {
            return num1 / num2;
        } else if (Objects.equals(dec, "%")) {
            System.out.println("quer adicionar ou subtrair da porcentagem? + - ");
            dec2 = scanner2.next();
            if (Objects.equals(dec2, "-")){
                return num1 - (num1 * 100 / num2);
            } else {
                return num1 + (num1 * 100 / num2);
            }
        }else{
            return 194;
        }

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }
}
