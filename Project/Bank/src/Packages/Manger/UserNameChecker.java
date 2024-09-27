package Packages.Manger;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class UserNameChecker {
    public void InfoGetterUserName () throws IOException {
        Scanner getBankUserName, checkBankUserName;
        getBankUserName = new Scanner(new FileInputStream("F:/other/Java/Project/DBUserName.txt"));
        checkBankUserName = new Scanner(System.in);

        boolean flag = true;

        String userName, userNameCheck;

        System.out.println("Enter username:");
        userNameCheck = checkBankUserName.next();

        while (getBankUserName.hasNext()) {
            userName = getBankUserName.next();
            if (userNameCheck.equals(userName)) {
                System.out.println("Username is already used.");
                flag = false;
                break;
            }
        }
        if(flag){
               try {
                     FileWriter inPut = new FileWriter("F:/other/Java/Project/DBUserName.txt");
                     inPut.write(userNameCheck);
                     inPut.close();
                     CodeMeliChecker singUplvl2 = new CodeMeliChecker();
                     singUplvl2.InfoGetterCodeMeli();
               }
                     catch (IOException e) {
                     System.out.println("An error occurred while writing to the file.");
                     e.printStackTrace();
               }
            }
    }
}