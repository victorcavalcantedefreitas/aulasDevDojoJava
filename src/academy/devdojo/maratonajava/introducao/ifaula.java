package academy.devdojo.maratonajava.introducao;

public class ifaula {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        //
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a beber bebida alcolica");
        }else{
            System.out.println("java");
        }
    }
}