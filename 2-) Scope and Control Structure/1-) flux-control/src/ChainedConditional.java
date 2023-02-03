public class ChainedConditional {
  public static void main(String[] args) {
    int grade = 4;

    if (grade >= 7){
      System.out.println("Approved Student!");
    } else {
      if (grade >= 5){
        System.out.println("Grade Recovery Student.");
      } else {
        System.out.println("Failed Student!");
      }
    }
  }
}
