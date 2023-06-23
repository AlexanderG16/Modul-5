package model;
import java.util.ArrayList;

public class Magister extends Mahasiswa {
    private ArrayList<MatkulAmbil> matkul = new ArrayList<>();
    private String judulTesis;

    public Magister(){}
    public Magister(String nama, String alamat, String telp, String ttl, String nim, String jurusan, ArrayList<MatkulAmbil> matkul, String tesis){
        super(nama, alamat, telp, ttl, nim, jurusan);
        this.matkul = matkul;
        this.judulTesis = tesis;
    }

    public void setMagisterMatkul(ArrayList<MatkulAmbil> matkul){
        this.matkul = matkul;
    }

    public void setMagisterTesis(String tesis){
        this.judulTesis = tesis;
    }

    public ArrayList<MatkulAmbil> getMagisterMatkul(){return this.matkul;}
    public String getMagisterTesis(){return this.judulTesis;}

    @Override
    public String toString(){
        String text = super.toString() + "Gelar: Magister\nMatkul:\n";
        for (int i = 0; i < this.matkul.size(); i++) {
            text += (i+1) + ". " + this.matkul.get(i).getMatkulNama() + "\n";
        }
        text += "Judul Tesis: " + this.judulTesis + "\n";

        return text;
    }
}
