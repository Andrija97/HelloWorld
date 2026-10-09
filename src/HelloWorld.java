import java.util.Scanner;

public class HelloWorld {
    static void main(String[] args) {
        System.out.println("Hello, World!");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett ord du vill eka tillbaka: ");
        String input = scanner.nextLine();

        System.out.println("Eko: " + input + "... " + input + "...");
        scanner.close();
    }
}
