package academy.devdojo.maratonajava.introducao;

public class aula10arraysmult {
    public static void main(String[] args) {
        // 1,2,3,4,5 Meses
        // 31, 28, 31, 30
        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 3;
        dias[0][2] = 15;

        dias[1][0] = 3420;
        dias[1][1] = 131;
        dias[1][2] = 153;

        dias[2][0] = 311;
        dias[2][1] = 321;
        dias[2][2] = 153;
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        for(int[] arrBase: dias){
            for (int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
