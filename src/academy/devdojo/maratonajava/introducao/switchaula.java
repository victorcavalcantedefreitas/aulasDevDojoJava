package academy.devdojo.maratonajava.introducao;

public class switchaula {
    public static void main(String[] args) {
        // imprima o dia da semana considerando 1 como domingo
        byte dia = 1;
        // char, int, byte, short, enum, String

        switch (dia) {
            default:
                System.out.println("Opção invalida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
        }



        String sexo = "M";
        switch (sexo) {
            case "M":
                System.out.println("Macho");
                break;
            case "F":
                System.out.println("Femea");
                break;
            default:
                System.out.println("Invalido");
                break;

        }
    }
}
