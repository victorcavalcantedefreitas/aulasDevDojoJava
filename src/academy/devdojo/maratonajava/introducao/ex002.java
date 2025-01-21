package academy.devdojo.maratonajava.introducao;

public class ex002 {
    public static void main(String[] args) {
        double salarioan = 20000.0;
        double valcpct = 0.0D;
        if (salarioan >= 0.0D && salarioan < 34712.0D){
            valcpct = (salarioan + (salarioan * 9.70 / 100));
        } else if (salarioan >= 34713.0D && salarioan <= 68506.0D) {
            valcpct = (salarioan + (salarioan * 37.35 / 100));
        } else{
            valcpct = (salarioan + (salarioan * 49.50 / 100));
        }
        System.out.println(valcpct);
    }
}