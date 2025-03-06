import java.util.Scanner;

public class app5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner une chaine ch");
        String ch = sc.nextLine();
        StringBuffer nv_ch;
        nv_ch = new StringBuffer(ch);
        for (int i = 1; i < nv_ch.length(); i += 2) {
            nv_ch.insert(i, '*');
        }
        System.out.println("La Nouvelle chaîne est : " + nv_ch);

        sc.close();

    }

}