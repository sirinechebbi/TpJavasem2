import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] M = new int[50][50];
        int nc, nl;
        do {
            System.out.println("donner le nombre de lignes");
            nl = scanner.nextInt();
            System.out.println("donner le nombre de colonnes");
            nc = scanner.nextInt();
        } while (nl > 50 && nc > 50);
        int i, j, x;
        for (i = 0; i < nl; i++) {
            for (j = 0; j < nc; j++) {
                do {
                    System.out.println("donner M[" + i + "," + j + "]= ");
                    M[i][j] = scanner.nextInt();
                } while (M[i][j] % 2 != 0);
            }
        }
        do {
            System.out.println("donner x");
            x = scanner.nextInt();
        } while (x % 2 != 0);
        i = 0;
        j = 0;
        boolean valid = false;
        while (!valid && i < nl && j < nc) {
            if (M[i][j] == x) {
                valid = true;
            } else if (i < nl && j == (nc - 1)) {
                j = 0;
                i++;
            } else {
                j++;
            }
        }
        if (valid) {
            System.out.println(x + "existe");
        } else {
            System.out.println(x + "n'existe pas");
        }

        scanner.close();

    }
}