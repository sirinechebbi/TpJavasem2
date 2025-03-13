import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        i = lectureN();
        int nbrchiff = CompterChiffre(i);
        System.out.println("l'entier " + i + " contient " + nbrchiff + " chiffres ");

    }

    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("donner un entier positive");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n < 0);
        return n;
    }

    public static int CompterChiffre(int n) {
        return String.valueOf(n).length();
    }
}
