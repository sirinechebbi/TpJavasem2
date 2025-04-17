import java.util.Scanner;

public class exercice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("donner a");
        a = sc.nextInt();
        System.out.println("donner b");
        b = sc.nextInt();
        System.out.println("donner une operation : +,-,*,/");
        char operation = sc.next().charAt(0);

        double resultat = 0;
        switch (operation) {
            case '+':
                resultat = methode2.addition(a, b);

                System.out.println("la somme =" + resultat);
                break;
            case '-':
                resultat = methode2.soustraction(a, b);
                System.out.println("la soustraction=" + resultat);
                break;
            case '*':
                resultat = methode2.multiplication(a, b);
                System.out.println("la multiplication =" + resultat);
                break;
            case '/':
                resultat = methode2.division(a, b);
                System.out.println("la division =" + resultat);
                break;
            default:
                System.out.println("operation inconnu");
                return;
        }
    }
}
