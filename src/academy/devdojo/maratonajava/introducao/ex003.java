package academy.devdojo.maratonajava.introducao;

public class ex003 {
    public static void main(String[] args) {
        byte dia = 5;
        switch (dia){
            default:
                System.out.println("Valor invalido");
                break;
            case 1:
                System.out.println("DOM Fim de semana");
                break;
            case 2:
                System.out.println("SEG Dia util");
                break;
            case 3:
                System.out.println("TER Dia util");
                break;
            case 4:
                System.out.println("QUA Dia util");
                break;
            case 5:
                System.out.println("QUI Dia Util");
                break;
            case 6:
                System.out.println("SEX Dia util");
                break;
            case 7:
                System.out.println("SAB Fim de semana");
                break;
        }
    }
}
