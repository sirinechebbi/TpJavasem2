import java.util.Scanner;

public class app1 {

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

    public static int somme(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somme(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = lectureN();
        int somme = somme(n);
        System.out.println("la somme de 1 à " + n + " est : " + somme);
    }

}