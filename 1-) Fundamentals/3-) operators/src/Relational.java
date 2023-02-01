public class Relational {
  public static void main(String[] args) throws Exception {
    int firstNumber, secondNumber;
    firstNumber = 1;
    secondNumber = 2;

    //relational operators
    System.out.println(firstNumber == secondNumber); //false
    System.out.println(firstNumber != secondNumber); //true
    System.out.println(firstNumber > secondNumber); //false
    System.out.println(firstNumber < secondNumber); //true
    System.out.println(firstNumber >= secondNumber); //false
    System.out.println(firstNumber <= secondNumber); //true

    String firstName = "JOAO";
    String lastName = "JOAO";
    System.out.println(firstName == lastName); //true -> it will compare the references

    String firstName2 = new String("JOAO");
    System.out.println(firstName == firstName2); //false -> texts and objects work different

    //If i want to compare the texts and objects i need to use the method equals
    System.out.println(firstName.equals(firstName2)); //true
  }
}