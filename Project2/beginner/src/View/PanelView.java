package View;

import Manager.UserPanel;

public class PanelView {
    public static void panelView(){
        UserPanel panel = new UserPanel();
        panel.panel("RegisterBankAccount", "Loan Application");
    }
}
