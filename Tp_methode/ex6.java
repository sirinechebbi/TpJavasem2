import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = methodeEx6.lectureN();
        int f = methodeEx6.factorielle(n);
        System.out.println("la factorielle de " + n + " est " + f);
    }
}
