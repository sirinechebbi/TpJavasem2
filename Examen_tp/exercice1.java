import java.util.Scanner;

public class exercice1 {
    public static double convertir(String ch) {
        return Double.parseDouble(ch);
    }

    public static void affichage(int[][] M) {
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M.length; j++) {
                System.out.println(M[i][j] + " | ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M = { { 1, 2 }, { 3, 4 } };
        affichage(M);
        String ch;
        System.out.println("donner ch");
        ch = sc.nextLine();
        double n = convertir(ch);
        System.out.println("la chaine convertie en double" + n);
        sc.close();
    }
}