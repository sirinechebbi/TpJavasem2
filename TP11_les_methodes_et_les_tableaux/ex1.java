import java.util.Scanner;

public class ex1 {
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

    public static int lectureX() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("entrez un entier");
        while (!sc.hasNextInt()) {
            System.out.println("Erreur: Veuillez entrer un entier valide");
            sc.next();
        }
        x = sc.nextInt();

        return x;

    }

    public static void RemplirTab(int[] tab, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("donner T [" + i + "]");
            tab[i] = sc.nextInt();

        }
    }

    public static void Remplacer(int[] tab, int n, int x1, int x2) {
        for (int i = 0; i < n; i++) {
            if (tab[i] == x1) {
                tab[i] = x2;
            }
        }
    }

    public static void afichage(int[] tab, int n) {
        System.out.println("le tableau");
        for (int i = 0; i < n; i++) {

            System.out.println(tab[i] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        int[] tab = new int[10];
        RemplirTab(tab, n);
        System.out.println("donner x1");
        int x1 = lectureX();
        System.out.println("donner x2");
        int x2 = lectureX();
        Remplacer(tab, n, x1, x2);
        afichage(tab, n);
    }
}