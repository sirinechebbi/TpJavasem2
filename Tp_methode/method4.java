import java.util.Scanner;

public class method4 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner un entier positive");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur: donner un entier valide");
                sc.nextInt();
            }
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("donner un entier psitives");
            }
        } while (n <= 0 && n > 1000);
        return n;
    }

    public static int sommecube(int n) {
        int unité = (n % 100) % 10;
        int dizaine = (n % 100) / 10;
        int centaine = n / 100;
        return (int) (Math.pow(centaine, 3) + Math.pow(dizaine, 3) + Math.pow(unité, 3));
    }

    public static boolean Estarmastrong(int n) {
        return n == sommecube(n);

    }
}
