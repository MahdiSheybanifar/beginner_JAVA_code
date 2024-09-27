package Packages.View;

import Packages.Manger.UserNameChecker;

import java.io.IOException;
import java.util.Scanner;

public class UserPanel{
    Scanner scanner = new Scanner(System.in);
    public void panel () throws IOException {
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. RegisterBankAccount");
            System.out.println("2. ManageAccount");
            System.out.println("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    UserNameChecker singUplvl1 = new UserNameChecker();
                    singUplvl1.InfoGetterUserName();
                case 2:
                    System.out.println("درودا");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        scanner.close();
    }
}