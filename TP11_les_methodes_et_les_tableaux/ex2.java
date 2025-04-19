import java.util.Scanner;

public class ex2 {
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez le nombre d'élèves (>=5) : ");
            n = sc.nextInt();
        } while (n < 5);
        return n;
    }

    public static void Remplirtab(double[] tab) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            double note;
            do {
                System.out.print("Note de l'élève " + (i + 1) + " (0-20) : ");
                note = sc.nextDouble();
            } while (note < 0 || note > 20);
            tab[i] = note;
        }
    }

    public static double calcul_Moy(double[] tab) {
        double somme = 0;
        double moy;
        for (int i = 0; i < tab.length; i++) {
            somme += tab[i];
        }
        moy = somme / (tab.length);
        return moy;
    }

    public static int NombreNote(double[] tab, double moy) {
        int compteur = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > moy) {
                compteur += 1;
            }
        }
        return compteur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = lectureN();
        double[] tab = new double[n];
        Remplirtab(tab);
        calcul_Moy(tab);
        System.out.println("la moyenne est =" + calcul_Moy(tab));
        NombreNote(tab, calcul_Moy(tab));
        System.out.println("lz nombre de note > moyenne est = " + NombreNote(tab, calcul_Moy(tab)));
    }

}
