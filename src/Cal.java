import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = input.nextDouble();
        System.out.println("Enter the height");
        double height = input.nextDouble();

        rectangle rec = new rectangle(width , height);
        System.out.println("You rectangle \n" + rec.display() );
        System.out.println("Perimeter of the rectangle: "+ rec.getPerimeter());
        System.out.println("Area of the rectangle"+ rec.getArea());
    }
}
