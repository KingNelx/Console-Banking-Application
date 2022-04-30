import java.util.Scanner;

final public class CreateAccount implements Messages{
    Scanner accountCreate = new Scanner(System.in);

    public void messageAlert(){
        System.out.println(" Account Successfully Created");
    }

    public void errorMessage(){
        System.out.println(" Something is not right! ");
    }

    public void createAccount() {
        String firstName;
        String lastName;
        String address;
        int pinId;
        int rePinId;

        System.out.println(" Fill up the following to Register a Bank Account ");

        System.out.print(" Firstname: ");
        firstName = accountCreate.next();

        System.out.print(" Lastname: ");
        lastName = accountCreate.next();

        System.out.print(" Address: ");
        address = accountCreate.next();

        System.out.print(" Pin ID: ");
        pinId = accountCreate.nextInt();

        System.out.print(" Re-enter PinID: ");
        rePinId = accountCreate.nextInt();

        if(!(pinId == rePinId))
        {
            errorMessage();
//          System.exit(1);
            createAccount();
        }
        else {
            System.out.println(" PinID match");
            messageAlert();
        }
    }
}
