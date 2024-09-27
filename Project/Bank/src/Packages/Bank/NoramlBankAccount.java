package Packages.Bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoramlBankAccount{
    public float inputBalance, monthlyProfit = 2, balance;
    public float inventory;
    public void normalAccount () {
        Scanner getBalance = new Scanner(System.in);

        inputBalance = getBalance.nextFloat();

        try {
            FileWriter inPut = new FileWriter("F:/other/Java/Project/DBBankUser.txt");
            System.out.print("Deposit : " + inputBalance);
            balance =  inputBalance * monthlyProfit;
            inPut.write((int)balance);
            inPut.close();
        }
        catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    public void inventoryGetter () throws FileNotFoundException {
        Scanner getInventory;
        getInventory = new Scanner(new FileInputStream("F:/other/Java/Project/DBBankUser.txt"));
        inventory = getInventory();
    }
    public float getInventory() {
        return inventory;
    }
}