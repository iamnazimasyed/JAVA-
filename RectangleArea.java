/*Write a Java program to calculate the area of a rectangle. The program should prompt the user to enter the length and width of the rectangle, calculate the area using the formula area = length * width, and then display the result.*/
import java.util.Scanner;
 class RectangleArea 
{
    public static void main(String[] args)
   {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * width;

        // Display the area of the rectangle
        System.out.println("The area of the rectangle is: " + area);

        // Close the scanner
        scanner.close();
    }
}
