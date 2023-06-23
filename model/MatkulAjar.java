package model;
import java.util.ArrayList;

public class MatkulAjar extends Matkul{
    private ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public MatkulAjar(){}
    public MatkulAjar(String nama, String kode, int sks, ArrayList<PresensiStaff> presensi){
        super(nama, kode, sks);
        this.presensi = presensi;
    }

    public ArrayList<PresensiStaff> getMatkulAjarPresensi(){return this.presensi;}

    public void setMatkulAjarPresensi(ArrayList<PresensiStaff> presensi){
        this.presensi = presensi;
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < this.presensi.size(); i++) {
            text += (i+1) + ". " + this.presensi.get(i) + "\n";
        }
        return super.toString() + "Presensi:\n" + text;
    }
}
