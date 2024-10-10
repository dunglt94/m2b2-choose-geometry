import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Print the rectangle");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 9; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                System.out.println("Print the square triangle");
                System.out.println("Choose the position of square angle:");
                System.out.println("1. Bottom-left");
                System.out.println("2. Top-left");
                System.out.println("3. Bottom-right");
                System.out.println("4. Top-right");
                System.out.println("5. Exit");
                System.out.println("Enter your choice:");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Bottom-left square angle");
                        for (int i = 0; i < 5; i++) {
                            for (int j = i + 1; j > 0; j--) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println("Top-left square angle");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5 - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println("");
                        }
                        break;
                    case 3:
                        System.out.println("Bottom-right square angle");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (j >= 4 - i)System.out.print("*");
                                else System.out.print(" ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 4:
                        System.out.println("Top-right square angle");
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                if (j >= i)System.out.print("*");
                                else System.out.print(" ");
                            }
                            System.out.println("");
                        }
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println("No choice!");
                }
                break;
            case 3:
                System.out.println("Print isosceles triangle");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        if (j >= 4 - i)System.out.print("*");
                        else System.out.print(" ");
                    }
                    if (i >= 1) {
                        for (int j = i; j > 0; j--) {
                            System.out.print("*");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
