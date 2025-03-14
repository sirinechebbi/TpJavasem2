import java.util.Scanner;

public class exercice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = methodeEx3.lectureN();
        int s = methodeEx3.calculesomme(n);
        System.out.println("le carré de l'entier est " + s);

    }
}
