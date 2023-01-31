public class Logics {
  public static void main(String[] args) throws Exception {
    int firstNumber, secondNumber;
    firstNumber = 1;
    secondNumber = 2;

    //logical operators
    System.out.println(firstNumber == 1 && secondNumber == 2); //true
    System.out.println(firstNumber == 1 && secondNumber == 1); //false
    System.out.println(firstNumber == 1 || secondNumber == 1); //true
    System.out.println(firstNumber == 2 || secondNumber == 1); //false
    System.out.println(!(firstNumber == 1)); //false
    System.out.println(!(firstNumber == 2)); //true

    boolean firstCondition, secondCondition;
    firstCondition = true;
    secondCondition = false;

    if (firstCondition && secondCondition) { //if both conditions are true
      System.out.println("Both conditions are true");
    } else {
      System.out.println("Some or all conditions are not true");
    }

    boolean result = firstCondition && secondCondition ? true : false; //Validates if both conditions are true
    System.out.println(result); //false

    result = firstCondition || secondCondition ? true : false; //Validates if at least one condition is true
    System.out.println(result); //true

    result = firstCondition && (7>4) ? true : false; 
    System.out.println(result); //true
  }
}
