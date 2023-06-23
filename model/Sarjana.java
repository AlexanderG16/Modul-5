package model;
import java.util.ArrayList;

public class Sarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkul = new ArrayList<>();

    public Sarjana(){}
    public Sarjana(String nama, String alamat, String telp, String ttl, String nim, String jurusan, ArrayList<MatkulAmbil> matkul){
        super(nama, alamat, telp, ttl, nim, jurusan);
        this.matkul = matkul;
    }

    public void setSarjanaMatkul(ArrayList<MatkulAmbil> matkul){
        this.matkul = matkul;
    }

    public ArrayList<MatkulAmbil> getSarjanaMatkul(){return this.matkul;}

    @Override
    public String toString(){
        String text = super.toString() + "Gelar: Sarjana\nMatkul:\n";
        for (int i = 0; i < this.matkul.size(); i++) {
            text += (i+1) + ". " + this.matkul.get(i).getMatkulNama() + "\n";
        }

        return text;
    }

}
