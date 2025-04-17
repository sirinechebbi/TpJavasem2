import java.util.Scanner;

public class methodeEx5 {

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

    public static double lectureX() {
        Scanner sc = new Scanner(System.in);
        double x;
        do {
            System.out.println("donner un double x :");
            while (!sc.hasNextInt()) {
                System.out.println("donner un double valide :");
                sc.nextInt();
            }
            x = sc.nextInt();
            if (x < 0) {
                System.out.println("donner un double positif :");
            }
        } while (x <= 0);
        return x;
    }

    public static double puissance(int n, double x) {
        double p;
        p = Math.pow(n, x);
        return p;
    }
}
