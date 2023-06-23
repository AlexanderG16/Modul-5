package model;
public class MatkulPilihan extends Matkul {
    private int minMahasiswa;

    public MatkulPilihan(){}
    public MatkulPilihan(String nama, String kode, int sks, int minmhs){
        super(nama, kode, sks);
        this.minMahasiswa = minmhs;
    }

    public int getMatkulPilihanMinMhs(){return this.minMahasiswa;}

    public void setMatkulPilihanMinMhs(int minmhs){
        this.minMahasiswa = minmhs;
    }

    @Override
    public String toString() {
        return super.toString() + "Minimal Jumlah Mahasiswa: " + this.minMahasiswa + "\n";
    }
}
