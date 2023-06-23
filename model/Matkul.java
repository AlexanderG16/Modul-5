package model;
public class Matkul {
    private String nama, kode;
    private int SKS;

    public Matkul(){}
    public Matkul(String nama, String kode, int sks){
        this.nama = nama;
        this.kode = kode;
        this.SKS = sks;
    }

    public String getMatkulNama(){return this.nama;}
    public String getMatkulCode(){return this.kode;}
    public int getMatkulSKS(){return this.SKS;}

    public void setMatkulNama(String nama){
        this.nama = nama;
    }
    public void setMatkulCode(String kode){
        this.kode = kode;
    }
    public void setMatkulSKS(int sks){
        this.SKS = sks;
    }

    public String toString() {
        return "Nama Mata Kuliah: " + this.nama + "\nKode: " + this.kode + "\nJumlah SKS: " + this.SKS + "\n";
    }
}
