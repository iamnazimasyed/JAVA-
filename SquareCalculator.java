import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = sc.nextDouble();

        double square = num * num;

        System.out.println("Square: " + square);

        sc.close();
    }
}
