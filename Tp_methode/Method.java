import java.util.Scanner;

public class Method {
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur: Veuillez entrer un entier valide");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n <= 0);
        return n;
    }

    public static boolean EstPair(int n) {
        return n % 2 == 0;
    }
}
