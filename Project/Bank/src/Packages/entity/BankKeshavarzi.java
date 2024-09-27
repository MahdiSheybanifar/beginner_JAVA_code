package Packages.entity;

import Packages.Bank.NoramlBankAccount;
import Packages.Bank.Sepordeh;

public class BankKeshavarzi {
    NoramlBankAccount userInfoGetter = new NoramlBankAccount();
    Sepordeh loan = new Sepordeh();
    public void depositAndProfit() {
        userInfoGetter.normalAccount();
    }
    public void balnce(){
        userInfoGetter.getInventory();
    }
    public void receiveLoan(){
        loan.paymentShortTerm = 1000;
        loan.sepordehGhozarShortTerm();
    }
}