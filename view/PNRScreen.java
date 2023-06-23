package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;

public class PNRScreen {
    public PNRScreen(){
        Controller c = new Controller();

        boolean menu = true;
        while(menu) {
            String kode = JOptionPane.showInputDialog(null, "Input Kode Matkul (Type 'Exit' to go back):");
            if (kode.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printNilaiRata(kode, Main.users), "Nilai Rata-Rata Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
