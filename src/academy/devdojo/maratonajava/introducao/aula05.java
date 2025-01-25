package academy.devdojo.maratonajava.introducao;

public class aula05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for(int parcela = (int)valorTotal; parcela >= 1; parcela--){
            double ValorParcela = valorTotal / parcela;
            if(ValorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " RS" + ValorParcela);
        }

    }
}
