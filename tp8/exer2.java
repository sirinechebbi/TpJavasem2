import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text, mot1, mot2;
        System.out.println("donner text");
        text = sc.nextLine();
        System.out.println("donner un mot 1");
        mot1 = sc.nextLine();
        System.out.println("donner un mot 2");
        mot2 = sc.nextLine();
        if (text.indexOf(mot1) == -1) {
            System.out.println("mot1 n'existe pas dans le texte");
        } else {
            int L = mot1.length();

            int p = text.indexOf(mot1);
            String x = text.replace(mot1, mot2);

            System.out.println("le nouveau texte est:" + x);

        }
    }
}
