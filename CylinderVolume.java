/*Write a Java program to calculate the volume of a cylinder. Prompt the user to enter the radius and height of the cylinder, calculate the volume using the formula volume = π * radius^2 * height, and then display the result.*/
import java.util.Scanner;

public class CylinderVolume 
{
    public static void main(String[] args) 
   {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius of the cylinder
        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        // Prompt the user to enter the height of the cylinder
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the cylinder
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Display the volume of the cylinder
        System.out.println("The volume of the cylinder is: " + volume);

        // Close the scanner
        scanner.close();
    }
}
