package Manager;

import View.PanelView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Login {
    private String userNameInPut = "is null for now";
    private String passWordInPut = "is null for now";
    public void massage (String inPutMassage){
        System.out.println(inPutMassage);
    }
    public void getAndCheckUserAndPass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username:");
        String inPutUserName = scanner.nextLine();
        this.userNameInPut = inPutUserName;
        System.out.println("Enter password:");
        String inPutPassWord = scanner.nextLine();
        this.passWordInPut = inPutPassWord;
        userAndPassBlankChecker(inPutUserName, inPutPassWord);
        chekUserAndPass(inPutUserName, inPutPassWord);
    }
    private void userAndPassBlankChecker(String userNameInPut, String passWordInPut){
        this.userNameInPut = userNameInPut;
        this.passWordInPut = passWordInPut;
        if (userNameInPut.isBlank() || passWordInPut.isBlank()){
            try {
                throw new IllegalAccessException("Username or Password cannot be blank");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void chekUserAndPass(String userName, String passWord){
        Scanner getInfo;
        boolean flag = false;
        try {
            //UserPass DB Location
            getInfo = new Scanner(new FileInputStream("F:/other/Java/Project2/LoginDB.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(getInfo.hasNext()){
            userName = getInfo.next();
            passWord = getInfo.next();
            if (this.userNameInPut.equals(userName) && this.passWordInPut.equals(passWord)){
                System.out.println("You are logged in.");
                PanelView.panelView();
                flag = true;
            } else if (!flag) {
                System.out.println("Incorrect Information. LoginFailed");
                break;
            }
        }
    }
}