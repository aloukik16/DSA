package loops;

public class sumOFfirstN {
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
