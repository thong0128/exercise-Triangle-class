import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, side3;
        String color;
        boolean filled;
        System.out.println("Create your Triangle");
        do {
            System.out.print("Input side 1: ");
            side1 = input.nextDouble();
            System.out.print("Input side 2: ");
            side2 = input.nextDouble();
            System.out.print("Input side 3: ");
            side3 = input.nextDouble();
            if(side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
                System.out.println("Invalid triangle, please input again!");
            else break;
        }while (true);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your triangle color: ");
        color = scanner.nextLine();
        System.out.print("Do you want your triangle to be filled? y/n: ");
        while (true) {
            String ans = scanner.nextLine();
            if (ans.equalsIgnoreCase("y")) {
                filled = true;
                break;
            } else if (ans.equalsIgnoreCase("n")) {
                filled = false;
                break;
            } else {
                System.out.println("Sorry, I didn't catch that. Please answer y/n");
            }
        }
        Triangle t1 = new Triangle(side1, side2, side3, color, filled);
        System.out.println(t1);
    }
}