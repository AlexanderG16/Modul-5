package view;

import javax.swing.JOptionPane;

import controller.Controller;
import main.Main;
import model.Mahasiswa;

public class PNAScreen {
    public PNAScreen(){
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
                boolean menu2 = true;
                while(menu2){
                    String kode = JOptionPane.showInputDialog(null, "Input Kode Matkul (Type 'Exit' to go back):\nP.S. Doktor tidak perlu mengisi Kode Matkul");
                    if (kode.equals("Exit")){menu2 = false;}
                    else{
                        JOptionPane.showMessageDialog(null, c.printNilaiAkhir(nim, kode, Main.users), "Nilai Akhir Siswa", JOptionPane.INFORMATION_MESSAGE);
                        menu2 = false;
                    }
                }
            }
        }
    }
}
