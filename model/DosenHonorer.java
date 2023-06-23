package model;
import java.util.ArrayList;

public class DosenHonorer extends Dosen {
    private int honorPerSKS;

    public DosenHonorer(){}
    public DosenHonorer(String nama, String alamat, String telp, String ttl, String nik, String departemen, ArrayList<MatkulAjar> matkul, int honorPerSKS){
        super(nama, alamat, telp, ttl, nik, departemen, matkul);
        this.honorPerSKS = honorPerSKS;
    }

    public int getDosenHonorerHonorPerSKS(){
        return this.honorPerSKS;
    }

    public void setDosenHonorerHonorPerSKS(int honorPerSKS){
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + "Honor Per SKS: " + this.honorPerSKS + "\n";
    }
}
