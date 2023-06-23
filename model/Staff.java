package model;
public abstract class Staff extends User {
    private String nik;

    public Staff(){}
    public Staff(String nama, String alamat, String telp, String ttl, String nik){
        super(nama, alamat, telp, ttl);
        this.nik = nik;
    }

    public String getStaffNIK(){return this.nik;}

    public void setStaffNIK(String nik){
        this.nik = nik;
    }

    @Override
    public String toString(){
        return super.toString() + "Type: Staff\nNIK: " + this.nik + "\n";
    }
}
