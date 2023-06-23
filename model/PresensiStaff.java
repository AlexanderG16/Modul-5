package model;
public class PresensiStaff extends Presensi{
    private int jam;

    public PresensiStaff(){}
    public PresensiStaff(String tanggal, int status, int jam){
        super(tanggal, status);
        this.jam = jam;
    }

    public int getPresensiStaffJam(){return this.jam;}

    public void setPresensiStaffJam(int jam){
        this.jam = jam;
    }

    @Override
    public String toString(){
        return super.toString() + "Jam: " + this.jam + "\n";
    }
}
