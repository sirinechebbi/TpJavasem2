import java.util.Scanner;

public class appli3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner une chaine ch");
        String ch = sc.nextLine();
        int i = 0;
        boolean test = true;
        int L = ch.length();
        while (test && i < L / 2) {
            if (ch.charAt(i) != ch.charAt(L - i - 1)) {
                test = false;
            }
            i++;
        }
        if (test) {
            System.out.println("la chaine est palindrome");
        } else {
            System.out.println("la chaine n'est pas palindrome");
        }

        sc.close();
    }
}
