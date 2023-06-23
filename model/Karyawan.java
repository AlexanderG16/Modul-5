package model;
import java.util.ArrayList;

public class Karyawan extends Staff {
    int salary;
    ArrayList<PresensiStaff> presensi = new ArrayList<>();

    public Karyawan(){}
    public Karyawan(String nama, String alamat, String telp, String ttl, String nik, int salary, ArrayList<PresensiStaff> presensi){
        super(nama, alamat, telp, ttl, nik);
        this.salary = salary;
        this.presensi = presensi;
    }

    public int getKaryawanSalary(){
        return this.salary;
    }

    public ArrayList<PresensiStaff> getKaryawanPresensi(){
        return this.presensi;
    }

    public void setKaryawanSalary(int salary){
        this.salary = salary;
    }
    public void setKaryawanPresensi(ArrayList<PresensiStaff> presensi){
        this.presensi = presensi;
    }

    @Override
    public String toString(){
        String text = super.toString() + "Pekerjaan: Karyawan\nSalary: " + this.salary + "\nPresensi:\n";
        for (int i = 0; i < this.presensi.size(); i++) {
            text += (i+1) + ". " + this.presensi.get(i) //Presensi
             + "\n";
        }

        return text;
    }
}
