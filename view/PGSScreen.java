package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Staff;

public class PGSScreen {
    public PGSScreen(){
        Controller c = new Controller();

        String text = "";
        for (int index = 0, counter = 0; index < Main.users.size(); index++) {
            if (Main.users.get(index) instanceof Staff){
                Staff temp = (Staff) Main.users.get(index);
                text += (counter+1) + ". " + temp.getUserName() + " - " + temp.getStaffNIK() + "\n";
                counter++;
            }
        }

        boolean menu = true;
        while(menu) {
            String nik = JOptionPane.showInputDialog(null, text + "\nInput NIK (Type 'Exit' to go back):");
            if (nik.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printGajiStaff(nik, Main.users), "Total gaji staff", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
