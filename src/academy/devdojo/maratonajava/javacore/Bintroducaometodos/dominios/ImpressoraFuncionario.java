package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario){
        System.out.println("os dados são: ");
        System.out.println(funcionario.idade);
        System.out.println(funcionario.nome);
        for (int i = 0; i < funcionario.salario.length; i++) {
            System.out.println("Salario "+(i+1)+": "+ funcionario.salario[i]);
        }
    }
}

