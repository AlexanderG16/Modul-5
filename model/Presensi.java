package model;
public class Presensi implements Status{
    private String tanggal;
    private int status;

    public Presensi(){}
    public Presensi(String tanggal, int status){
        this.tanggal = tanggal;
        this.status = status;
    }

    public String getPresensiTanggal(){return this.tanggal;}
    public int getPresensiStatus(){return this.status;}

    public void setPresensiTanggal(String tgl){
        this.tanggal = tgl;
    }
    public void setPresensiStatus(int status){
        this.status = status;
    }

    public String toString(){
        String text = "Alpha";
        if (this.status == Status.HADIR){text = "Hadir";}
        return "Presensi Tanggal: " + this.tanggal + "\nStatus: " + text + "\n";
    }
}
