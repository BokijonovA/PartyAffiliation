import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.print("Your choice: ");

        char choice = scanner.next().toUpperCase().charAt(0);

        switch (choice) {
            case 'D':
                System.out.println("You get a Democratic Donkey.");
                break;
            case 'R':
                System.out.println("You get a Republican Elephant.");
                break;
            case 'I':
                System.out.println("You get an Independent Person.");
                break;
            default:
                System.out.println("You get Other.");
        }
        scanner.close();
    }
}
