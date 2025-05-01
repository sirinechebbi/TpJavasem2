import java.util.Scanner;

public class app1 {
    public static double lectureN() {
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

    public static double sommetab(double[] t) {
        double somme = 0;
        for (int i = 0; i < t.length; i++) {
            somme += t[i];
        }
        return somme;
    }

    public static void incrementtab(double[] t, double n) {
        for (int i = 0; i < t.length; i++) {
            t[i] += n;
        }
    }

    public static void afficherTab(double[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] t = { 1.5, 3.2, 12.3, 15.75, 20.20, 16.60 };
        sommetab(t);
        double n = lectureN();
        incrementtab(t, n);
        System.out.println("Tableau après incrémentation :");
        afficherTab(t);

        sc.close();
    }
}