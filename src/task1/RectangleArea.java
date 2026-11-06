
package task1;
import java.util.Scanner;
public class RectangleArea {

    public static int calculateArea(int length, int width) {
        return length * width;
    }
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter integer length:  ");
        int length1 = input.nextInt();

        System.out.print("Enter integer width: ");
        int width1 = input.nextInt();

        System.out.println("Integer area: " +calculateArea(length1, width1) );

        System.out.print ("Enter double length: ");
        double length2 = input.nextDouble();

        System.out.print ("Enter double width: ");
        double width2 = input.nextDouble();

        System.out.println("Double area: " + calculateArea(length2, width2));

        input.close();
    }
}
