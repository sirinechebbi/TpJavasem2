import java.util.Scanner;

public class methodeEx2 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
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

    public static int compterchiff(int n) {
        int nbr = 0;
        while (n != 0) {
            nbr++;
            n = n / 10;

        }
        return nbr;

    }
}
