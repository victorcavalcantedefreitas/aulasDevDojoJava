package academy.devdojo.maratonajava.introducao;

public class ifaula {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        //
        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a beber bebida alcolica");
        }
        if(!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }
    }
}