import java.util.Scanner;

public class Average {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Q-1) Average of 3 Numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = sc.nextInt();
        System.out.print("Enter Second number: ");
        int B = sc.nextInt();
        System.out.print("Enter third number: ");
        int C = sc.nextInt();

        int Avg = (A+B+C) / 3 ;
        System.out.println("The Average of three number is = " + Avg);
    }
}
