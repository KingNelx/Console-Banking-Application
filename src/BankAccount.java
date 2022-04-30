import java.util.Scanner;

public class BankAccount {

    public static void main (String[]args) {

        int options;
        int transferID;
        double withdraw;
        double deposit;
        double transferMoney;


        CreateAccount s1 = new CreateAccount();
        BankOption option = new BankOption();
        RandomBalance balance = new RandomBalance();

        int myBalance = balance.randomBalance();
        Scanner input = new Scanner(System.in);

        s1.createAccount();
        System.out.println(" Random balanced generated: " + myBalance);
        do {
        option.bankOptions();
        System.out.print(" Select Option: ");
        options = input.nextInt();

            switch (options) {
                case 1:
                    System.out.println(" Current Balance is: " + myBalance);
                    break;

                case 2:
                    System.out.print(" Input Amount to withdraw: ");
                    withdraw = input.nextDouble();
                    if (withdraw > myBalance) {
                        WithdrawError();
                    } else {
                        myBalance -= withdraw;
                        System.out.print(" Current Balance is: " + myBalance);
                    }
                    break;

                case 3:
                    System.out.print(" Input Amount to deposit: ");
                    deposit = input.nextInt();
                    myBalance += deposit;
                    System.out.print(" Current Balance is: " + myBalance);
                    break;

                case 4:
                    System.out.print(" Input designated PIN ID: ");
                    transferID = input.nextInt();

                    System.out.print(" Input Amount to be transfer: ");
                    transferMoney = input.nextInt();

                    if(transferMoney > myBalance){
                        TransferError();
                    }else{
                        myBalance -= transferMoney;
                        System.out.print(" Current Balance is: " + myBalance);
                    }
                    break;

                case 5:
                    System.out.println(" Thank you have a nice Day !");
                    break;
            }
            }
            while (options != 5) ;

    }

    static void WithdrawError(){
        System.out.println(" Something is not right !");
        System.out.println(" Balance is not enough .");
    }

    static void TransferError(){
        System.out.println(" Something is not right !");
        System.out.println(" Balance is not enough .");
    }

}
