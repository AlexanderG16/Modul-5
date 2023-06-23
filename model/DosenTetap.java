package model;
import java.util.ArrayList;

public class DosenTetap extends Dosen {
    private int salary;

    public DosenTetap(){}
    public DosenTetap(String nama, String alamat, String telp, String ttl, String nik, String departemen, ArrayList<MatkulAjar> matkul, int salary){
        super(nama, alamat, telp, ttl, nik, departemen, matkul);
        this.salary = salary;
    }

    public int getDosenTetapSalary(){
        return this.salary;
    }

    public void setDosenTetapSalary(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Salary: " + this.salary + "\n";
    }
}
