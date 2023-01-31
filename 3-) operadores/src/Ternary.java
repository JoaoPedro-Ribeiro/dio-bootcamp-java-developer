public class Ternary {
  public static void main(String[] args) throws Exception {
    int firstNumber, secondNumber;
    firstNumber = 1;
    secondNumber = 2;

    if (firstNumber == secondNumber) { //"Big" validation
      System.out.println("They are equal");
    } else {
      System.out.println("They are not equal");
    }

    String result = firstNumber==secondNumber ? "They are equal" : "They are not equal"; //Ternary operator -> in this case this is expecting a string but if it were int it would expect 1 or 0.
    System.out.println(result);
  }
}
