package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Dosen;

public class PTJDScreen {
    public PTJDScreen(){
        Controller c = new Controller();

        String text = "";
        for (int index = 0, counter = 0; index < Main.users.size(); index++) {
            if (Main.users.get(index) instanceof Dosen){
                Dosen temp = (Dosen) Main.users.get(index);
                text += (counter+1) + ". " + temp.getUserName() + " - " + temp.getStaffNIK() + "\n";
                counter++;
            }
        }

        boolean menu = true;
        while(menu) {
            String nik = JOptionPane.showInputDialog(null, text + "\nInput NIK (Type 'Exit' to go back):");
            if (nik.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printTotalJamDosen(nik, Main.users), "Total jam mengajar dosen", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
