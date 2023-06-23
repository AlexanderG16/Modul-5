package view;

import javax.swing.JOptionPane;

public class MainMenu {
    public MainMenu() {
        showMainMenu();
    }
    
    private void showMainMenu() {
        Boolean menu = true;
        while(menu) {
            int choosen = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Menu: \n1. Print User Data \n2. Print Nilai Akhir \n3. Print Rata-Rata Nilai Akhir Seluruh Mahasiswa\n4. Print Mahasiswa tidak lulus matkul\n5. Print Matkul Ambil untuk Mahasiswa\n6. Print Jam Dosen Mengajar\n7. Print Gaji Staff\n8. Exit"));
            switch(choosen) {
                case 1: new PUDScreen();
                    break;
                case 2: new PNAScreen();
                    break;
                case 3: new PNRScreen();
                    break;
                case 4: new PTLScreen(); //Print Tidak Lulus
                    break;
                case 5: new PMAScreen(); //Print Matkul Ambil
                    break;
                case 6: new PTJDScreen(); //Print Total Jam Dosen
                    break;
                case 7: new PGSScreen(); //Print Gaji Staff
                    break;
                case 8: menu = false;
                    break;
            }
        }
    }
}
