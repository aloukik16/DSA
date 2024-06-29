import java.util.Scanner;

public class AreaOfSquare {
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square: ");
        int side = sc.nextInt();
        int Area = side*side;
        System.out.println("The Area of square is = " + Area);
    }
}
