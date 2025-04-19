import java.util.Scanner;

public class ex3 {
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

    public static void RemplirTab(int[] tab, int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            do {
                System.out.println("Donner T[" + i + "] (entier positif) :");
                tab[i] = sc.nextInt();
                if (tab[i] < 0) {
                    System.out.println("Erreur : l'entier doit être positif !");
                }
            } while (tab[i] < 0);

        }
    }

    public static int[] CréerTpair(int[] tab, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 == 0) {
                count++;
            }
        }
        int[] R = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 == 0) {
                R[index++] = tab[i];
            }
        }
        return R;
    }

    public static int[] CréerTimpair(int[] tab, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 != 0) {
                count++;
            }
        }
        int[] S = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (tab[i] % 2 != 0) {
                S[index++] = tab[i];
            }
        }
        return S;
    }

    public static void afichage(int[] tab, int n, int[] R, int[] S) {
        System.out.println("le tableau initial");
        for (int i = 0; i < n; i++) {

            System.out.println(tab[i] + " ");
        }
        System.out.println("le tableau des entiers pairs");
        for (int i = 0; i < R.length; i++) {
            System.out.println(R[i] + " ");
        }
        System.out.println("le tableau des entiers impaires");
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i] + " ");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        int[] tab = new int[n];
        RemplirTab(tab, n);
        int[] R = CréerTpair(tab, n);
        int[] S = CréerTimpair(tab, n);
        afichage(tab, n, R, S);
    }
}
