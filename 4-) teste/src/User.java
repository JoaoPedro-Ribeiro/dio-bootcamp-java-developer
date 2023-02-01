public class User {
    public static void main(String[] args) throws Exception {
        
        Config config = new Config();
        config.clearConsole();

        SmartTv smartTv = new SmartTv();

        Boolean userOK = true;
        while (userOK){
            System.out.println("What do you want to do?");
            System.out.println("1 - Turn on the Tv");
            System.out.println("2 - Turn off the Tv");
            System.out.println("3 - Increase the volume");
            System.out.println("4 - Decrease the volume");
            System.out.println("5 - Increase the channel");
            System.out.println("6 - Decrease the channel");
            System.out.println("7 - Set the channel");
            System.out.println("8 - Show current status");
            System.out.println("9 - Exit");
            System.out.print("Option: ");

            int userOption = 0;
            try {
                userOption = Integer.parseInt(System.console().readLine());
            } catch (Exception e) {
                System.out.println("\nInvalid option");
            }

            switch (userOption) {
                case 1:
                    config.clearConsole();
                    smartTv.turnOn();
                    break;
                case 2:
                    config.clearConsole();
                    smartTv.turnOff();
                    break;
                case 3:
                    config.clearConsole();
                    smartTv.increaseVolume();
                    break;
                case 4:
                    config.clearConsole();
                    smartTv.decreaseVolume();
                    break;
                case 5:
                    config.clearConsole();
                    smartTv.increaseChannel();
                    break;
                case 6:
                    config.clearConsole();
                    smartTv.decreaseChannel();
                    break;
                case 7:
                    config.clearConsole();
                    System.out.println("Which channel do you want to change?");
                    System.out.print("Channel: ");
                    int newChannel = Integer.parseInt(System.console().readLine());
                    smartTv.changeChannel(newChannel);
                    break;
                case 8:
                    config.clearConsole();
                    System.out.println("\nThe Tv is on?: " + smartTv.isOn);
                    System.out.println("Which channel is the Tv on?: " + smartTv.currentChannel);
                    System.out.println("Which volume is the Tv on?: " + smartTv.currentVolume + "\n");
                    break;
                case 9:
                    userOK = false;
                    break;
                default:
                    config.clearConsole();
                    System.out.println("Invalid option \n");
                    break;
            }
        }
    }
}
