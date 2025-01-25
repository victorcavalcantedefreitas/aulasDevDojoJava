package academy.devdojo.maratonajava.introducao;

public class ex005 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = 1; parcela <= valorTotal; parcela++){
            double ValorParcela = valorTotal / parcela;
            if (ValorParcela >= 1000) {
                System.out.println("Parcela "+ parcela+ " RS"+ValorParcela);
                continue;
            }
            System.out.println("Fora do if, mas dentro do for "+parcela);

        }

    }
}
