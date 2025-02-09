package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominios;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    public void imprime() {
        System.out.println("Os dados são: ");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        for (int i = 0; i < salario.length; i++) {
            System.out.println("Salário " + (i + 1) + ": " + salario[i]);
        }
        System.out.println("A média é: " + getMedia());
    }

    public double getMedia() {
        double soma = 0;
        for (int i = 0; i < salario.length; i++) {
            soma += salario[i];
        }
        return soma / salario.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
