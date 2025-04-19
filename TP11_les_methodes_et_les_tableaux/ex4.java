import java.util.Scanner;

public class ex4 {
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

    public static void RemplirMat(double[][] Mat, int nl, int nc) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                do {
                    System.out.println("Donner T[" + i + "] (entier positif) :");
                    Mat[i][j] = sc.nextInt();
                    if (Mat[i][j] < 0) {
                        System.out.println("Erreur : l'entier doit être positif !");
                    }
                } while (Mat[i][j] < 0);

            }
        }
    }

    public static int CalculSomme(double[][] Mat, int nc, int i) {

        int Somme = 0;
        for (int j = 0; j < nc; j++) {
            Somme += Mat[i][j];
        }
        return Somme;
    }

    public static void main(String[] args) {
        System.out.println("Entrez les dimensions de la matrice :");
        int nl = lectureN();
        int nc = lectureN();

        double[][] Mat = new double[nl][nc];

        RemplirMat(Mat, nl, nc);

        System.out.println(" Sommes des lignes :");
        for (int i = 0; i < nl; i++) {
            double somme = CalculSomme(Mat, nc, i);
            System.out.println("Somme de la ligne " + i + " = " + somme);
        }
    }
}
