public class AboutMe {
  /**
   * @param args
   */
  public static void main (String[] args) {
    String firstName = args [0];
    String lastName = args [1];
    int age = Integer.valueOf(args [2]);
    double height = Double.valueOf(args [3]);

    System.out.println("Hello! My name is " + firstName + " " + lastName + ".");
    System.out.println("I am " + age + " years old.");
    System.out.println("My height is " + height + " cm.");
  }
}
