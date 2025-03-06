import java.util.Scanner;

public class application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donne une chaine ch");
        String ch = sc.nextLine();
        int pos = ch.indexOf(" ");
        String S_ch = ch.substring(0, pos);
        System.out.println("la premier mot de ch est <<" + S_ch + ">>");
        sc.close();
    }
}
