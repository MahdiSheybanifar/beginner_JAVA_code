package Manager;

import java.util.Scanner;

public class LoanManager {
    private int loanAmount = 0;
    private Scanner scanner = new Scanner(System.in);
    public void loanBankName(){
        String bankName = UserPanel.panel("What IS Your Bank: ", "Meli Bank", "Maskan Bank","Sepah Bank");
        if(bankName.equals("Meli Bank")){
            loanAccounting(" (Max is $5000)" ,0,5000);
        } else if (bankName.equals("Maskan Bank")){
            loanAccounting(" (Max is $10000)" ,0,10000);
        } else if (bankName.equals("Sepah Bank")){
            loanAccounting(" (Max is $20000)" ,0,20000);
        }
    }
    private void loanAccounting(String massge,int min, int max){
        System.out.println("Loan Amount :" + massge);
        loanAmount = scanner.nextInt();
            if (this.loanAmount > min && this.loanAmount <= max){
                System.out.println(loanAmount +"$ Added To Your Acount");
            }
            else{
                System.out.println("The request was rejected with the value you entered!");
            }
    }
}