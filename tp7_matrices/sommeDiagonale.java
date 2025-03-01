import java.util.Scanner;

public class sommeDiagonale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nc, nl;
        System.out.print("Entrez le nombre de ligne: ");
        nl = scanner.nextInt();
        System.out.print("Entrez le nombre de colonne: ");
        nc = scanner.nextInt();
        int[][] A = new int[nl][nc];
        int i, j;
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                System.out.println("donner M[" + i + "," + j + "]=");
                A[i][j] = scanner.nextInt();
            }
        }

        int somme = 0;
        for (i = 0; i < nl; i++) {
            somme += A[i][i];
        }
        System.out.println("La somme de la diagonale principale est : " + somme);

        scanner.close();
    }
}
