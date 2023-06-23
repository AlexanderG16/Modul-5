package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Mahasiswa;

public class PMAScreen {
    public PMAScreen(){
        Controller c = new Controller();

        String text = "";
        for (int index = 0; index < Main.users.size() && Main.users.get(index) instanceof Mahasiswa; index++) {
            Mahasiswa temp = (Mahasiswa) Main.users.get(index);
            text += (index+1) + ". " + temp.getUserName() + " - " + temp.getMhsNIM() + "\n";
        }

        boolean menu = true;
        while(menu) {
            String nim = JOptionPane.showInputDialog(null, text + "\nInput NIM (Type 'Exit' to go back):");
            if (nim.equals("Exit")){menu = false;}
            else{
                JOptionPane.showMessageDialog(null, c.printMatkulAmbilMhs(nim, Main.users), "List Matkul yang diambil mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
