import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input N:");
        System.out.println(Factorial.sumDigitsInFactorial(scanner.nextInt()));
    }
}
