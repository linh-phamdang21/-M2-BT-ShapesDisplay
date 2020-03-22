import java.util.Scanner;

public class ShapesDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right ");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        int inputValue = scanner.nextInt();

        while (inputValue != 4){
            switch (inputValue){
                case 1:
                    for (int i = 0; i < 3; i++){
                        for (int j = 0; j < 7; j++){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j <= i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    for (int i = 5; i > 0; i--){
                        for (int j = 0; j < i; j++){
                            System.out.print("* ");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
            }
            break;
        }
    }
}
