public class SwitchCase {

  public static void sizeChainedConditional (String size){
    //Chained conditional
    if (size == "S") {
      System.out.println("Small");
    } else if (size == "M") {
      System.out.println("Medium");
    } else if (size == "L") {
      System.out.println("Large");
    } else {
      System.out.println("Undefined");
    }
  }

  public static void sizeSwitchCase (String size){
    //Switch case
    switch (size) {
      case "S":
        System.out.println("Small");
        break;
      case "M":
        System.out.println("Medium");
        break;
      case "L":
        System.out.println("Large");
        break;
      default:
        System.out.println("Undefined");
    }
  }

  public static void phonePlaneChainedConditional (String phonePlane){
    //With chained conditional the code is bigger and harder to read and maintain. Also, we start to repeat too many times the same code.
    if (phonePlane == "Basic"){
      System.out.println("100 minutes of call time.");
    }else if (phonePlane == "Midia"){
      System.out.println("100 minutes of call time.");
      System.out.println("Free WhatsApp and Instragram.");
    }else if (phonePlane == "Turbo"){
      System.out.println("100 minutes of call time.");
      System.out.println("Free WhatsApp and Instragram.");
      System.out.println("5GB Youtube.");
    }else{
      System.out.println("Invalid phone plane.");
    }
  }

  public static void phonePlaneSwitchCaseWithBreaks (String phonePlane){
    //With switch case the code is smaller and easier to read and maintain. But, with the breaks we repeat the code too.
    switch (phonePlane) {
      case "Basic":
        System.out.println("100 minutes of call time.");
        break;
      case "Midia":
        System.out.println("100 minutes of call time.");
        System.out.println("Free WhatsApp and Instragram.");
        break;
      case "Turbo":
        System.out.println("100 minutes of call time.");
        System.out.println("Free WhatsApp and Instragram.");
        System.out.println("5GB Youtube.");
        break;
      default:
        System.out.println("Invalid phone plane.");
    }
  }

  public static void phonePlaneSwitchCaseWithoutBreaks (String phonePlane){
    //With switch case the code is smaller and easier to read and maintain. Without the breaks we don't repeat the code, but we need to be careful with the order of the cases. Remember that the cases are evaluated from top to bottom. Remeber also to put a break in the last case.
    switch (phonePlane) {
      case "Turbo":
        System.out.println("5GB Youtube.");
      case "Midia":
        System.out.println("Free WhatsApp and Instragram.");
      case "Basic":
        System.out.println("100 minutes of call time.");
        break;
      default:
        System.out.println("Invalid phone plane.");
    }
  }
  public static void main(String[] args) {
    String size = "M";
    String phonePlane = "Basic";

    //sizeChainedConditional(size);
    sizeSwitchCase(size);
    
    //phonePlaneChainedConditional(phonePlane);
    //phonePlaneSwitchCaseWithBreaks(phonePlane);
    phonePlaneSwitchCaseWithoutBreaks(phonePlane);
  }
}
