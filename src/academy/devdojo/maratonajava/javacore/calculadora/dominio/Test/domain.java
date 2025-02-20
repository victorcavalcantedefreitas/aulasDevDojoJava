package academy.devdojo.maratonajava.javacore.calculadora.dominio.Test;

import java.util.Objects;
import java.util.Scanner;

public class domain {
    private double num1;
    private double num2;
    private String dec;
    private String dec2;

    public void pegarOsValoreseCalcula(){
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        String[] operacoesAceitas = {"+", "-", "/", "*", "%"};

        System.out.println("Qual o tipo de operação deseja realizar? + - * / %");
        dec = sc1.next();
        boolean valortOf = false;
        for(String deca : operacoesAceitas){
            if(dec.equals(deca)){
                valortOf = true;
                break;
            }
        }

        if(valortOf){
            System.out.println("numero 1: ");
            num1 = sc2.nextDouble();
            System.out.println("Numero 2: ");
            num2 = sc3.nextDouble();
            System.out.println(Calculo());
        } else{
            System.out.println("Valor invalido!");
        }


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
            String[] valPerm = {"+", "-"};

            boolean valorBol = false;

            for (String s : valPerm) {
                if (s.equals("-")) {
                    valorBol = true;
                    break;
                }
            }

            if(valorBol){
                if (Objects.equals(dec2, "-")){
                    return num1 - (num1 * num2 / 100);
                } else {
                    return num1 + (num1 * num2 / 100);
                }
            }


        }else{
            return 194;
        }
        return 121;
    }
}
