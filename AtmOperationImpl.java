
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AtmOperationImpl  implements AtmInterface {

    Atm atm = new Atm();
    Map<Double,String> ministmt = new HashMap<>() ;
    @Override
    public void viewBalance() {
        System.out.println("AvailableBalance:"+atm.getBalance());
    }
    
    @Override
    public void withdrawAmount (double withdrawAmount) {
        if(withdrawAmount%100==0) {
            if(withdrawAmount<= atm.getBalance()){
                System.out.println("collect the cash"+withdrawAmount);
                atm.setBalance(atm.getBalance()-withdrawAmount);
                ministmt.put(withdrawAmount,"Amount Withdrawn");
                viewBalance();

            }
            else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Enter the amount in terms 100");
        }

    }

    @Override
    public void depositAmount (double depositAmount) {
        System.out.println("depositAmount is :"+depositAmount);
        atm.setBalance(atm.getBalance()+depositAmount);
        ministmt.put( depositAmount, "Deposited Successfully");
        viewBalance();
    }
    @Override
     public void viewMiniStatement() {
        Set<Double> set = ministmt.keySet();
        for(Double d:set) {
            System.out.println(d+"="+ministmt.get(d));
        }

     }
}