import java.util.Scanner;

public class app4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner une chaine ch");
        String ch = sc.nextLine();
        StringBuffer inverse;
        inverse = new StringBuffer(ch);
        inverse = inverse.reverse();
        System.out.println("Chaîne inversée est : " + inverse);
        sc.close();

    }
}
