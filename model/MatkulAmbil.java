package model;
import java.util.ArrayList;

public class MatkulAmbil extends Matkul{
    private ArrayList<Presensi> presensi = new ArrayList<>();
    private double n1, n2, n3;

    public MatkulAmbil(){}
    public MatkulAmbil(String nama, String kode, int sks, ArrayList<Presensi> presensi, double n1, double n2, double n3){
        super(nama, kode, sks);
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ArrayList<Presensi> getMatkulAmbilPresensi(){return this.presensi;}
    public double getMatkulAmbilNilai1(){return this.n1;}
    public double getMatkulAmbilNilai2(){return this.n2;}
    public double getMatkulAmbilNilai3(){return this.n3;}

    public void setMatkulAmbilPresensi(ArrayList<Presensi> presensi){
        this.presensi = presensi;
    }
    public void setMatkulAmbilNilai1(double n1){this.n1 = n1;}
    public void setMatkulAmbilNilai2(double n2){this.n2 = n2;}
    public void setMatkulAmbilNilai3(double n3){this.n3 = n3;}

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < this.presensi.size(); i++) {
            text += (i+1) + ". " + this.presensi.get(i) + "\n";
        }
        return super.toString() + "Presensi:\n" + text + "Nilai 1: " + this.n1 + "\nNilai 2: " + this.n2 + "\nNilai 3: " + this.n3;
    }
}
