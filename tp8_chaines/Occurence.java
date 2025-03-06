import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        char Car;
        System.out.println("donner une chaine ch =");
        ch = sc.nextLine();
        System.out.println("donner le caractere rechercher Car =");
        Car = sc.next().charAt(0);
        int Nbr_occur = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == Car) {
                Nbr_occur += 1;
            }
        }
        System.out.println("le caractere est apparait " + Nbr_occur + " fois dans la chaine ch ");
        sc.close();
    }
}
