package View;

import Manager.Login;

public class Main {
    public static void main(String[] args){
        //UserName : user
        //PassWord : pass
        Login login = new Login();
        login.massage("Hello And Welcome, Please Enter Your Information For Login");
        login.getAndCheckUserAndPass();
    }
}