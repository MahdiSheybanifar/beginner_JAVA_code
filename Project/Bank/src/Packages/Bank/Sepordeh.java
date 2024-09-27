package Packages.Bank;

import java.util.Scanner;
public class Sepordeh extends NoramlBankAccount{
    Scanner scanner = new Scanner(System.in);
    public float paymentShortTerm;
    public void sepordehGhozarShortTerm(){

        float shortTerm;
        int loanOneMill = 10, loanTwoMill = 20, loanThreeMill = 30;
        
        NoramlBankAccount inventoryVam = new NoramlBankAccount();
        float loanConditions = inventoryVam.getInventory();
        shortTerm = loanConditions;

        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. vamOneMill, Account balance above 10,000.");
            System.out.println("2. vamTwoMill, Account balance above 20,000.");
            System.out.println("3. vamThreeMill, Account balance above 30,000");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    if (shortTerm >= 10000) {
                        balance = loanOneMill * inventory;
                        System.out.println("The loan was deposited into your account.");
                    }
                    else {
                        System.out.println("The loan conditions are not met for you.");
                    }
                case 2:
                    if (shortTerm >= 20000) {
                        balance = loanTwoMill * inventory;
                        System.out.println("The loan was deposited into your account.");
                    }
                    else {
                        System.out.println("The loan conditions are not met for you.");
                    }
                case 3:
                    if (shortTerm >= 30000) {
                        balance = loanThreeMill * inventory;
                        System.out.println("The loan was deposited into your account.");
                    }
                    else {
                        System.out.println("The loan conditions are not met for you.");
                    }
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}