package java_for_beginner;
import java.util.Scanner;

public class helloworld {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello " + name + "!");
    }
}