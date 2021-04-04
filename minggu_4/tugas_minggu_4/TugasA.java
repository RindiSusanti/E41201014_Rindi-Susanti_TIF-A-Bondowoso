import java.util.Scanner;

public class TugasA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int awalBilangan, batasBilangan;

        System.out.println("Masukkan bilangan awal : ");
        awalBilangan = sc.nextInt();

        System.out.println("Masukkan bilangan akhir : ");
        batasBilangan = sc.nextInt();

        for (int i = awalBilangan; i <= batasBilangan; i++) {
            if ( i % 2 == 0){
                System.out.print(i + " ");
            }
        }
	}
}
