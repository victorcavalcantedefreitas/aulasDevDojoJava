package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(21-2);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        double resultado = num1 / num2;
        return resultado;
    }
}
