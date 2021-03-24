public class TugasC {

    public static void main(String args[]) {
        int[][] angka = {
                {5, 6, 1, 7},
                {8, 1, 2, 9},
                {5, 4, 7, 1},
                {8, 3, 7, 5}
        };

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(angka[i][j] + " ");
            }
            System.out.println();
        }
    }

}
