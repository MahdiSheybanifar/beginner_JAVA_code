package Packages.Manger;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class CodeMeliChecker {
    public void InfoGetterCodeMeli() throws IOException {
        Scanner getCodeMeli, checkCodeMeli;
        getCodeMeli = new Scanner(new FileInputStream("F:/other/Java/Project/DBCodMelli.txt"));
        checkCodeMeli = new Scanner(System.in);

        boolean flag = true;

        String CodeMeli, codeMeliCheck;

        System.out.println("Enter CodeMeli:");
        codeMeliCheck = checkCodeMeli.next();

        while (getCodeMeli.hasNext()) {
            CodeMeli = getCodeMeli.next();
            if (codeMeliCheck.equals(CodeMeli)) {
                System.out.println("CodeMeli is already used.");
                flag = false;
                break;
            }
        }
        if(flag){
            try {
                FileWriter inPut = new FileWriter("F:/other/Java/Project/DBCodMelli.txt");
                inPut.write(codeMeliCheck);
                inPut.close();
                InputUserInfo singUplvl3 = new InputUserInfo();
                singUplvl3.passGetter();
                singUplvl3.nameGetter();

            }
            catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            }
        }
    }
}