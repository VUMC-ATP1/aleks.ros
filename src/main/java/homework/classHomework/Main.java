package homework.classHomework;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Triangle Create_triangle_1 = new Triangle();
        System.out.print("Enter first length: ");
        Create_triangle_1.First_side = scan.nextInt();
        System.out.print("Enter second length: ");
        Create_triangle_1.Second_side = scan.nextInt();
        System.out.print("Enter third length: ");
        Create_triangle_1.Third_side = scan.nextInt();

        Triangle Create_triangle_2 = new Triangle(Create_triangle_1.First_side, Create_triangle_1.Second_side, Create_triangle_1.Third_side);

        System.out.println("Triangle area is " + Create_triangle_2.Triangle_Area);

        if (Create_triangle_1.Equilateral()) {
            System.out.print("Triangle is Equilateral.");
        } else {
            System.out.println("Triangle is not Equilateral");
        }

        if (Create_triangle_1.Isosceles()) {
            System.out.println("Triangle is Isosceles.");
        } else {
            System.out.println("Triangle is not Isosceles.");
        }

    }
}