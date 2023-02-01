public class SmartTv {
  boolean isOn = false;
  int currentChannel = 1;
  int currentVolume = 25;

  public void turnOn() {
    if (!isOn){
      isOn = true;
      System.out.println("Turning on the Tv. \n");
    }else{
      System.out.println("The Tv is already on. \n");
    }
    
  }

  public void turnOff() {
    if (isOn){
      isOn = false;
      System.out.println("Turning off the Tv. \n");
    }else{
      System.out.println("The Tv is already off. \n");
    }
  }

  public void increaseVolume() {
    if (isOn){
      currentVolume++;
      System.out.println("Increasing the volume for: " + currentVolume + "\n");
    } else {
      System.out.println("The Tv is off \n");
    }
  }

  public void decreaseVolume() {
    if (isOn){
      currentVolume--;
      System.out.println("Turning down the volume for: " + currentVolume + "\n");
    } else {
      System.out.println("The Tv is off \n");
    }
  }

  public void increaseChannel() {
    if (isOn){
      currentChannel++;
      System.out.println("Increasing the channel for: " + currentChannel + "\n");
    } else {
      System.out.println("The Tv is off \n");
    }
  }

  public void decreaseChannel() {
    if (isOn){
      currentChannel--;
      System.out.println("Decreasing the channel for: " + currentChannel + "\n");
    } else {
      System.out.println("The Tv is off \n");
    }
  }

  public void changeChannel(int newChannel) {
    if (isOn){
      currentChannel = newChannel;
      System.out.println("\nChanging the channel for: " + currentChannel + "\n");
    } else {
      System.out.println("The Tv is off \n");
    }
  }
}
