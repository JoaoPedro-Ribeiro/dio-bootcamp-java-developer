import java.util.Locale;
import java.util.Scanner;

public class App {
  public static void main (String[] args) {
    try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("What is your name?");
      String firstName = scanner.next();
      
      System.out.println("What is your last name?");
      String lastName = scanner.next();

      System.out.println("What is your age?");
      int age = scanner.nextInt();
      
      System.out.println("What is your height?");
      double height = scanner.nextDouble();

      System.out.println("Hello! My name is " + firstName + " " + lastName + ".");
      System.out.println("I am " + age + " years old.");
      System.out.println("My height is " + height + " cm.");
    }
  }
}
