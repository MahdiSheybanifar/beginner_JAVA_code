package Manager;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InfoGetter{
    public void infoGetter(String infoType, String shortInfoType){
        Scanner getInfo = new Scanner(System.in);
        System.out.println(infoType);
        String info = getInfo.next();
        try {
            //User Info Location
            FileWriter inPut = new FileWriter("F:/other/Java/Project2/UserInfoDB.txt", true);
            inPut.write(shortInfoType + " :" + info + "\n");
            inPut.flush();
            inPut.close();
            System.out.println(shortInfoType + " Saved On DataBase");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
    //Overload
    public void infoGetter(String bankName){
        bankName = UserPanel.panel("Select Your Bank: ","Meli Bank", "Maskan Bank","Sepah Bank");
        String info = bankName;
        try {
            //User Info Location
            FileWriter inPut = new FileWriter("F:/other/Java/Project2/UserInfoDB.txt", true);
            inPut.write("BankName :" + info + "\n");
            inPut.flush();
            inPut.close();
            System.out.println(bankName + " Saved On DataBase");
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}