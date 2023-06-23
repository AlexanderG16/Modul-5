package model;

public class Doktor extends Mahasiswa {
    private String judulPenelitian;
    private double sidang1, sidang2, sidang3;

    public Doktor(){}
    public Doktor(String nama, String alamat, String telp, String ttl, String nim, String jurusan, String penelitian, double s1, double s2, double s3){
        super(nama, alamat, telp, ttl, nim, jurusan);
        this.judulPenelitian = penelitian;
        this.sidang1 = s1;
        this.sidang2 = s2;
        this.sidang3 = s3;
    }

    public void setDoktorPenelitian(String penelitian){
        this.judulPenelitian = penelitian;
    }

    public void setDoktorSidang1(double s1){
        this.sidang1 = s1;
    }
    public void setDoktorSidang2(double s2){
        this.sidang2 = s2;
    }
    public void setDoktorSidang3(double s3){
        this.sidang3 = s3;
    }

    public String getDoktorPenelitian(){return this.judulPenelitian;}
    public double getDoktorNilaiS1(){return this.sidang1;}
    public double getDoktorNilaiS2(){return this.sidang2;}
    public double getDoktorNilaiS3(){return this.sidang3;}

    @Override
    public String toString(){
        String text = super.toString() + "Gelar: Doktor\n";
        text += "Judul Penelitian: " + this.judulPenelitian + "\n";
        text += "Nilai Sidang 1: " + this.sidang1 + "\n";
        text += "Nilai Sidang 2: " + this.sidang2 + "\n";
        text += "Nilai Sidang 3: " + this.sidang3 + "\n";

        return text;
    }
}
