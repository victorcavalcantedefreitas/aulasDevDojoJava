package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.Funcionario;


public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setSalario(new double[]{1230.0d,2003.0d, 3202.0d,2031.1});
        funcionario.setNome("Victor");
        funcionario.setIdade(15);
        funcionario.imprime();
//System.out.println("media: "+media);
    }
}
