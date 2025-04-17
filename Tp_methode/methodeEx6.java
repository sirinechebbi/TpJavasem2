import java.util.Scanner;

public class methodeEx6 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner un entier n :");
            while (!sc.hasNextInt()) {
                System.out.println("donner un entier valide :");
                sc.nextInt();
            }
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("donner un entier positif :");
            }
        } while (n <= 0);
        return n;
    }

    public static int factorielle(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;

        }
        return f;
    }
}
