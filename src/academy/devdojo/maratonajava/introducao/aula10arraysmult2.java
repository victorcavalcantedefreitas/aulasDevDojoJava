package academy.devdojo.maratonajava.introducao;

public class aula10arraysmult2 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        int[] array = {1,2,3};
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,331};
        for (int[] arrayBase: arrayInt){
            System.out.println("\n---");
            for(int num: arrayBase){
                System.out.print(num+" ");
            }
        }
    }
}
