package view;

import controller.Controller;
import javax.swing.JOptionPane;
import main.Main;

public class PUDScreen {
    public PUDScreen(){
        Controller c = new Controller();
        String text = "";
        for (int index = 0; index < Main.users.size(); index++) {
            text += (index+1) + ". " + Main.users.get(index).getUserName() + "\n";
        }
        
        boolean menu = true;
        while(menu) {
            String name = JOptionPane.showInputDialog(null, text + "\nInput Name (Type 'Exit' to go back):");
            if (name.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printUserData(name, Main.users), name + " data", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}

