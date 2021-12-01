package academy.devdojo.maratonajava.introducao.aula08;

public class ArraysMultidimensionais02Inicializacao {
    public static void main(String[] args) {
        int[][] arrayInt = new int [3][];
        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = new int[]{2, 3, 4};
        arrayInt[2] = new int[]{3, 4, 5};
        int[][] arrayInt2 = new int[][]{{1, 2, 3}, {3, 4, 5, 5}, {3, 5, 7}};

        for (int[] arrayBase: arrayInt2) {
            System.out.println();
            for (int num: arrayBase) {
                System.out.print(num + " ");
            }
        }

    }
}
