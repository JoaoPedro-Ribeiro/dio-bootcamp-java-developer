public class Ternary {
  public static void main(String[] args) {
    int grade = 6;
    String result = grade >= 7 ? "Approved Student" : "Failed Student"; //Simple ternary operator
    System.out.println(result);

    String averageResult = grade >= 7 ? "Approved Student" : grade >= 5 ? "Grade Recovery Student" : "Failed Student"; // Chained ternary operator
    System.out.println(averageResult);
  }
}
