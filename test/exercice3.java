import java.util.Scanner;

public class exercice3 {
    public static boolean estInf(String verbe) {
        return verbe.endsWith("er") || verbe.endsWith("ir") || verbe.endsWith("re") || verbe.endsWith("oir");
    }

    public static String Groupe(String verbe) {
        String x = "3 eme groupe ";
        if (verbe.equals("aller")) {
            return x;
        }
        if (verbe.equals("faire")) {
            return x;
        }
        if (verbe.equals("savoir")) {
            return x;
        }
        if (verbe.equals("sortir")) {
            return x;
        } else if (verbe.endsWith("er"))
            return "Premier groupe";
        else if (verbe.endsWith("ir")) {
            String radical = verbe.substring(0, verbe.length() - 2);
            return "Deuxième groupe ";
        }
        return x;
    }

    public static String demanderVerbe() {
        Scanner sc = new Scanner(System.in);
        String verbe;
        do {
            System.out.print("Entrez un verbe à l'infinitif : ");
            verbe = sc.nextLine().toLowerCase();
        } while (!estInf(verbe));
        return verbe;
    }

    public static void main(String[] args) {
        String verbe = demanderVerbe();
        String groupe = Groupe(verbe);
        System.out.println("Le verbe " + verbe + " est du " + groupe);

    }
}
