public class TugasB {
    public static void main(String[] args) {
        System.out.println("tugas b");

        int angkaulang = 1;

        System.out.println("bilangan kelipatan 2 - 100");

        do {
            int total2 = angkaulang * 2;
            if (total2 < 100) {
                System.out.print(total2 + " ");
            }
            angkaulang = total2;
        }while (angkaulang < 100);

    }
}
