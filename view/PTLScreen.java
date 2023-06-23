package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;

public class PTLScreen {
    public PTLScreen(){
        Controller c = new Controller();

        boolean menu = true;
        while(menu) {
            String kode = JOptionPane.showInputDialog(null, "Input Kode Matkul (Type 'Exit' to go back):");
            if (kode.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printMhsTidakLulus(kode, Main.users), "Mahasiswa-mahasiswa yang tidak lulus", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
