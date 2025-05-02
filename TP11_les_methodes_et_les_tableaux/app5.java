public class app5 {
    public static void affiche(double[][] t) {
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println(t[i][j] + "");
            }
            System.out.println();
        }
    }

    public static boolean regulier(double[][] t) {
        int longeur = t[0].length;
        for (int i = 1; i < t.length; i++) {
            if (t[i].length != longeur) {
                return false;
            }
        }
        return true;
    }

    public static double[] sommelignes(double[][] t) {
        double[] result = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            double somme = 0;
            for (int j = 0; j < t.length; j++) {
                somme += t[i][j];
            }
            result[i] = somme;
        }
        return result;
    }

    public static double[][] somme(double[][] t1, double[][] t2) {
        if (!regulier(t1) || !regulier(t2))
            return null;
        if (t1.length != t2.length || t1[0].length != t2[0].length)
            return null;
        double[][] result = new double[t1.length][t1[0].length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1[0].length; j++) {
                result[i][j] = t1[i][j] + t2[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double[][] t1 = {
                { 1.0, 2.0, 3.0 },
                { 4.0, 5.0, 6.0 }
        };
        double[][] t2 = {
                { 7.0, 8.0, 9.0 },
                { 10.0, 11.0, 12.0 }
        };
        System.out.println("affichez de t1:");
        affiche(t1);
        System.out.println("tableau t1 est regulier ?" + regulier(t1));
        double[] somme = sommelignes(t1);
        System.out.println("somme des lignes de t1:");
        for (double s : somme) {
            System.out.println(s);
        }
        double[][] sommetotale = somme(t1, t2);
        if (sommetotale != null) {
            System.out.println("le somme de t1 et t2 :");
            affiche(sommetotale);
        } else {
            System.out.println("erreur: tableaux non compatible pour la somme");
        }
    }
}
