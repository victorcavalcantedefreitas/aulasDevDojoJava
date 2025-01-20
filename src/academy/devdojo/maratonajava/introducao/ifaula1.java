package academy.devdojo.maratonajava.introducao;

public class ifaula1 {
    public static void main(String[] args) {
        // iadde < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        String categoria = "";

        int idade = 12;
        if(idade < 15) {
            categoria = "Categoria infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "juvenil";
        }else {
            categoria = "adulto";
        }
    }
}
