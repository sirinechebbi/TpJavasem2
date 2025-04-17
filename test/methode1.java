import java.util.Scanner;

public class methode1 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner un entier n:");
            while (!sc.hasNextInt()) {
                System.out.println("ce n'est pas un entier donner un autre  entier valide");
                sc.next();
            }
            n = sc.nextInt();
        } while (n <= 0);
        return n;
    }

    public static int compterchiff(int n) {
        int somme = 0;
        while (n != 0) {
            somme++;
            n = n / 10;

        }

        return somme;

    }
}
