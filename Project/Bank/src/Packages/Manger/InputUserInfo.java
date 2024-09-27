package Packages.Manger;

import Packages.View.UserPanel;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputUserInfo {
    public void passGetter(){
        String passWord;
        System.out.println("Enter Password:");
        Scanner getPassword = new Scanner(System.in);

        passWord = getPassword.nextLine();
        try {
            FileWriter inPut = new FileWriter("F:/other/Java/Project/DBPassWord.txt");
            inPut.write(passWord);
            inPut.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
    }
    public void nameGetter(){
        String name;
        System.out.println("Enter PesonsName:");
        Scanner getName = new Scanner(System.in);

        name = getName.nextLine();
        try {
            FileWriter inPut = new FileWriter("F:/other/Java/Project/DBName.txt");
            inPut.write(name);
            inPut.close();
            System.out.println("Account Created.");
            UserPanel gotopanel = new UserPanel();
            gotopanel.panel();
        }
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

    }
}