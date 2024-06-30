import java.util.Scanner;

public class Bill {
    @SuppressWarnings ("resource")
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil: $");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen: $");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser: $");
        float eraser = sc.nextFloat();

        float Total = pencil + pen + eraser;
        float tax = (Total * 18) / 100;
        float finalBill = Total + tax;

        System.out.println("Your Total Bill is: $" + finalBill);
    }
    
}
