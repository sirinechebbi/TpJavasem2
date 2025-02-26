import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M = new int[50][50];
        int nc, nl, i, j;
        do {
            System.out.println("donner le nombre de lignes");
            nl = scanner.nextInt();
            System.out.println("donner le nombre de colonnes");
            nc = scanner.nextInt();
        } while (nl > 30 && nc > 30);
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                do {
                    System.out.println("donner M[" + i + "," + j + "]= ");
                    M[i][j] = scanner.nextInt();
                } while (M[i][j] % 2 != 0);
            }
        }
        int somme = 0;
        double prod = 1;
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                somme += M[i][j];
                prod *= M[i][j];
            }
        }
        System.out.println("la somme est " + somme);
        System.out.println("le produit est " + prod);

    }
}
