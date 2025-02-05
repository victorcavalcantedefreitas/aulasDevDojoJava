package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.Funcionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.ImpressoraFuncionario;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios.MediaeImprime;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        ImpressoraFuncionario impressoraFuncionario = new ImpressoraFuncionario();
        MediaeImprime mediaeImprime = new MediaeImprime(); 
        funcionario.salario = new double[]{1230.0d,2003.0d, 3202.0d};
        funcionario.nome = "Victor";
        funcionario.idade = 17;
        impressoraFuncionario.imprime(funcionario);
        double media = mediaeImprime.mediaeImprime(funcionario.salario);
        System.out.println("media: "+media);
    }
}
