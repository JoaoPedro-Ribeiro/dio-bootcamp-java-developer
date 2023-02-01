public class Scope {
  //This variable is accessible to all methods in this class, because it is declared as a class variable.
  double balance = 1000;

  public void withdraw(double amount) {
    //This variable is only accessible to this method, because it is declared as a local variable.
    double newBalance = balance - amount;
    balance = newBalance;
  }

  public void deposit(double amount) {
    //This variable is only accessible to this method, because it is declared as a local variable.
    double newBalance = balance + amount;
    balance = newBalance;
  }

  public double getBalance() {
    return balance;
  }

  public void printBalance() {
    //This variable balance is accessible to this method, because it is declared as a class variable, and it is accessible to all methods in this class.
    System.out.println("Your balance is: " + balance);

    //This variable newBalance is not accessible to this method, because it is declared as a local variable, and it is only accessible to the withdraw() and deposit() methods.
    //System.out.println(newBalance);
  }

  public double calculateExponentialDebt() {
    //This variable is only accessible to this method, because it is declared as a local variable.
    double installmentsValue = 100.0;
    double amoutValue = 0.0;
    for (int i = 0; i < 12 ; i++) { 
      //These variables "i" and "calculatedValue" are only accessible to this loop, because they are declared as a local variables.
      double calculatedValue = installmentsValue * i;
      amoutValue = amoutValue + calculatedValue;
    }
    return amoutValue;
  }

  public static void main(String[] args) throws Exception {
    Scope account = new Scope();
    account.withdraw(100);
    account.deposit(200);
    account.printBalance();
    System.out.println("Your exponential debt is: " + account.calculateExponentialDebt());
  }
}