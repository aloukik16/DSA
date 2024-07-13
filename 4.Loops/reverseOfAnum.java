package loops;

public class reverseOfAnum {
    public static void main(String[] args) {
        // Print Last Digit = num % 10
        // Remove Last Digit = numr / 10
        int n = 10098;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit + "");
            n = n / 10;
        }
    }
}
