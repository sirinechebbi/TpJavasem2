import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String verbe;
        do {
            System.out.println("donner un verbe de 1ere groupe");
            verbe = sc.nextLine();

        } while (!verbe.endsWith("er") || verbe.equals("aller"));
        System.out.println("je " + verbe.replace("er", "e"));
        System.out.println("tu " + verbe.replace("er", "es"));
        System.out.println("il/elle " + verbe.replace("er", "e"));

        if (verbe.equals("manger")) {
            System.out.println("nous " + verbe.replace("er", "eons"));
        } else if (verbe.equals("commencer")) {
            System.out.println("nous " + verbe.replace("cer", "çons"));
        }

        System.out.println("vous " + verbe.replace("er", "ez"));
        System.out.println("Ils/Elles " + verbe.replace("er", "ent"));

        sc.close();
    }
}
