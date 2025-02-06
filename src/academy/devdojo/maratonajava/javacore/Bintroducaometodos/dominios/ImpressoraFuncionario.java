package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

import java.util.Arrays;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario){
        System.out.println("os dados são: ");
        System.out.println(funcionario.idade);
        System.out.println(funcionario.nome);
        System.out.println(Arrays.toString(funcionario.salario));
    }
}
