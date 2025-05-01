public class app6 {
    public static int maxTableau(int[] t) {
        if (t.length == 0) {
            System.out.println("un tableau vide n'a pas de maximum");
        }
        int max = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > max) {
                max = t[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] t = { 1, 2, 5, 89, 75, 10 };
        System.out.println("le maximum du tableau est " + maxTableau(t));
    }
}
