package Packages.View;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class LoginView{
    public static void main(String[] args) throws IOException {
        Scanner getInfo, checkInfo;
        getInfo = new Scanner(new FileInputStream("F:/other/Java/Project/DB.txt"));
        checkInfo = new Scanner(System.in);

        boolean flag = false;

        String userName, passWord, userNameCheck, passWordCheck;

        System.out.println("Enter username:");
        userNameCheck = checkInfo.next();

        System.out.println("Enter password:");
        passWordCheck = checkInfo.next();

        while(getInfo.hasNext()) {
            userName = getInfo.next();
            passWord = getInfo.next();
            if(userNameCheck.equals(userName) && passWordCheck.equals(passWord)) {
                System.out.println("You are logged in.");
                flag = true;
                UserPanel gotopanel = new UserPanel();
                gotopanel.panel();
            }
        }
        if(!flag)
            System.out.println("Incorrect password. LoginFailed");
    }
}