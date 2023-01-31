import java.io.IOException;

public class Config {
  public void clearConsole() throws IOException{
    
    final String os = System.getProperty("os.name");
    
    if (os.contains("Windows")){
        Runtime.getRuntime().exec("cls");
    }else{
        System.out.print("\033\143");
        Runtime.getRuntime().exec("clear");
    }
  }
}
