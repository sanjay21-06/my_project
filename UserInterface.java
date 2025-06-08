
import java.util.Scanner;

public class  UserInterface {
    private static int status;
    public static void main(String[] args) {
        AtmOperationImpl imp1=new AtmOperationImpl();
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int atm_number = 123456;
        int atm_pin = 123;
        System.out.println("WELCOME TO THE ATM MACHINE");
        System.out.println("Enter the ATM number :");
        int atmnum2 = scan.nextInt();
        System.out.println("Enter the ATM pin :");
        int atmpin2 = scan.nextInt(); 
        if(atm_number == atmnum2 && atm_pin == atmpin2){
            while (true) { 
                
            System.out.println(" 1.viewAvailable\n 2.WithdrawAmount\n 3.DepositAmount\n 4.viewMiniStatement\n 5.exit");
                System.out.println("enter the choices : ");
                int ch=scan.nextInt();
                if(ch==1) {
                    imp1.viewBalance();
                }
                else if(ch==2){
                    System.out.println("Enter the withdraw amount");
                    double withdrawAmount=scan.nextDouble();
                    imp1.withdrawAmount(withdrawAmount);
                }
                else if(ch==3){
                    System.out.println("Enter the amount to deposit");
                    double depositAmount = scan.nextDouble();
                    imp1.depositAmount(depositAmount);
                }
                else if(ch==4){
                    imp1.viewMiniStatement();
                }
                else if(ch==5){
                    System.out.println("Collect your ATM card \n Thankyou!");
                    System.exit(status);
                }
            }
        }
        else{
            System.out.println("Incorrect ATM number or ATM pin");
        }
    }
}
