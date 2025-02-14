package Desafio;

public class classSomas {
    private double num1;
    private double num2;
    private String tipo;

    public double equacoes(double num1, double num2){
        switch (tipo) {
            case "+" -> {
                return num1 + num2;
            }
            case "-" -> {
                return num1 - num2;
            }
            case "/" -> {
                if (num1 == 0 || num2 == 0) {
                    return 0;
                } else {
                    return num1 / num2;
                }
            }
            case "*" -> {
                return num1 * num2;
            }
            case null, default -> {
                System.out.println("Tenta novamente");
                return 0;
            }
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


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
