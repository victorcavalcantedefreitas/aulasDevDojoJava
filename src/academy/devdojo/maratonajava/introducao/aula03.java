package academy.devdojo.maratonajava.introducao;

public class aula03 {
    public static void main(String[] args) {
        // while, do whiçe, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        do {
            System.out.println(++count);
        }while (count < 10);
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
    }
}
