package model;
import java.util.ArrayList;

public abstract class Dosen extends Staff {
    private String departemen;
    private ArrayList<MatkulAjar> matkul = new ArrayList<>();

    public Dosen(){}
    public Dosen(String nama, String alamat, String telp, String ttl, String nik, String departemen, ArrayList<MatkulAjar> matkul){
        super(nama, alamat, telp, ttl, nik);
        this.departemen = departemen;
        this.matkul = matkul;
    }

    public String getDosenDepartemen(){
        return this.departemen;
    }

    public ArrayList<MatkulAjar> getDosenMatkulAjar(){
        return this.matkul;
    }

    public void setDosenDepartemen(String departemen){
        this.departemen = departemen;
    }
    public void setDosenMatkulAjar(ArrayList<MatkulAjar> matkul){
        this.matkul = matkul;
    }

    @Override
    public String toString(){
        String text = super.toString() + "Pekerjaan: Dosen\nDepartemen: " + this.departemen + "\nMatkul:\n";
        for (int i = 0; i < this.matkul.size(); i++) {
            text += (i+1) + ". " + this.matkul.get(i).getMatkulNama() + "\n";
        }

        return text;
    }
}
