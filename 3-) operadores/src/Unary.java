public class Unary {
  public static void main(String[] args) throws Exception {
    //unary operators
    int number = 1;
    System.out.println(number); //1
    System.out.println(+number); //1 -> it will not change the value because it is already positive
    System.out.println(-number); //-1 -> it will change the value to negative
    System.out.println(number++); //1 -> it will print the value and then increment it by 1
    System.out.println(number); //2
    System.out.println(++number); //3 -> it will increment the value by 1 and then print it
    System.out.println(number--); //3 -> it will print the value and then decrement it by 1
    System.out.println(number); //2
    System.out.println(--number); //1 -> it will decrement the value by 1 and then print it
    System.out.println(number); //1
    System.out.println(!true); //false -> it will change the value to false
    System.out.println(!false); //true -> it will change the value to true

    //If my number if already negative i need to multiply it for -1 to make it positive
    int secondNumber = 1;

    secondNumber = -secondNumber;
    System.out.println(secondNumber); //-1

    secondNumber = +secondNumber; //it will not change the value to positive, it will stay negative
    System.out.println(secondNumber); //-1
    
    secondNumber = secondNumber * -1; //now it will change the value to positive
    System.out.println(secondNumber); //1
  }
}
