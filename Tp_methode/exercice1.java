import java.util.Scanner;

public class exercice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] entiers = new int[10];

        // Lecture des 10 entiers
        System.out.println("Entrez 10 entiers strictement positifs : ");
        for (int i = 0; i < 10; i++) {
            entiers[i] = lectureN(sc);
        }

        // Affichage des nombres pairs
        System.out.print("Les entiers pairs sont : ");
        for (int n : entiers) {
            if (EstPair(n)) {
                System.out.print(n + " ");
            }
        }

        sc.close(); // Fermeture du scanner
    }

    // Méthode qui lit un entier strictement positif
    public static int lectureN(Scanner sc) {
        int n;
        do {
            System.out.println("entrez un entier strictement positif");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur :Veuillez entrer un entier validé");
                sc.nextInt();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Erreur: L'entier doit etre strictement positif");
            }
        } while (n <= 0);
        return n;
    }

    // Méthode qui vérifie si un nombre est pair
    public static boolean EstPair(int n) {
        return n % 2 == 0; // Retourne vrai si le reste de la division par 2 est 0
    }
}
