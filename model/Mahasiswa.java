package model;
public abstract class Mahasiswa extends User {
    private String nim, jurusan;

    public Mahasiswa(){}
    public Mahasiswa(String nama, String alamat, String telp, String ttl, String nim, String jurusan){
        super(nama, alamat, telp, ttl);
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public String getMhsNIM(){return this.nim;}
    public String getMhsJurusan(){return this.jurusan;}

    public void setMhsNIM(String nim){
        this.nim = nim;
    }

    public void setMhsJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    @Override
    public String toString(){
        return super.toString() + "Type: Mahasiswa\nNIM: " + this.nim + "\nJurusan: " + this.jurusan + "\n";
    }
}
