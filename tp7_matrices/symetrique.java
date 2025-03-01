import java.util.Scanner;

public class symetrique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes et colonnes de la matrice carrée : ");
        int n = sc.nextInt();
        int[][] matrice = new int[n][n];
        int i, j;
        boolean test = true;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("donner M[" + i + "," + j + "]=");
                matrice[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) { // Comparer uniquement la partie supérieure
                if (matrice[i][j] != matrice[j][i]) {
                    test = false;

                }
            }
        }

        if (test) {
            System.out.println("La matrice est symétrique.");
        } else {
            System.out.println("La matrice n'est pas symétrique.");
        }

        sc.close();
    }
}