package Manager;

import java.util.Scanner;

public class UserPanel{
    private static Scanner scanner = new Scanner(System.in);
    public void panel(String option1, String option2){
        int choice = 0;
        while (choice != 3) {
            System.out.println("Select an option: ");
            System.out.println("1. " + option1);
            System.out.println("2. " + option2);
            System.out.println("3. Quit");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Your Information: ");
                    InfoGetter infoGetterFromUser = new InfoGetter();
                    infoGetterFromUser.infoGetter("Enter FirstName: ", "FirstName");
                    infoGetterFromUser.infoGetter("Enter LastName: ", "LastName");
                    infoGetterFromUser.infoGetter("Enter BankName");
                    break;
                case 2:
                    LoanManager loan = new LoanManager();
                    loan.loanBankName();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
    //Overload
    public static String panel(String massge,String option1, String option2, String option3) {
        int choice = 0;
        while (choice != 3) {
            System.out.println(massge);
            System.out.println("1. " + option1);
            System.out.println("2. " + option2);
            System.out.println("3. " + option3);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    return option1;
                case 2:
                    return option2;
                case 3:
                    return option3;
                default:
                    System.out.println("Invalid choice");
            }
        }
        return null;
    }
}