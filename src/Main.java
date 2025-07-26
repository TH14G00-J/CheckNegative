import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.printf("%s%n", number < 0 ? "Negative" : "Positive");

//        if (number < 0) {
//            System.out.println("Negative");
//        }else {
//            System.out.println("Positive");
//        }
    }
}
