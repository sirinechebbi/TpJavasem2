import java.util.Scanner;

public class exercice2 {
    public static void affichage(String[][] VOL) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(VOL[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] VOL = { { "numvol", "1", "2", "3", "4" },
                { "vdep", "tozeur", "tozeur", "tunis", "djerba" },
                { "vdest", "djerba", "tunis", "djerba", "sfax" },
                { "codeAv", "Ab01", "Ab02", "Ab03", "Ab04", "140" },
                { "classAv", "A1", "A2", "A1", "A2", "120" },
                { "prixvol", "156", "250", "140", "120" } };
        System.out.println("la premiere lettre de ville de destination");
        char v = sc.nextLine().charAt(0);
        System.out.println("vol correspondant :");

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 4; j++) {
                if (VOL[i][j].contains("d")) {
                    System.out.println(
                            "numeroVol : " + VOL[0][j] + " | " + "vdep :" + VOL[1][j] + "|" + "vdest : " + VOL[2][j]
                                    + " | " + "codeav :" + VOL[3][j] + " | " + "prixvol : " + VOL[5][j]);
                }

            }
        }

        System.out.println("les vols apres remise");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                Double prix = Double.parseDouble(VOL[i][j]);
                VOL[1][j] = prix * 0.8;
            }
        }
        System.out.println("tableau apres remise");
        affichage(VOL);
    }
}
