package model;
import java.util.ArrayList;

public abstract class User {
    private String nama, alamat, telepon, ttl;
    // ttl format: "Tempat, Tanggal Lahir (tanggal-bulan-tahun)"

    public User(){}
    
    public User(String nama, String alamat, String telp, String ttl){
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telp;
        this.ttl = ttl;
    }

    public void setUserName(String nama){
        this.nama = nama;
    }
    
    public void setUserAddress(String alamat){
        this.alamat = alamat;
    }
    
    public void setUserPhoneNum(String telp){
        this.telepon = telp;
    }
    
    public void setUserTTL(String ttl){
        this.ttl = ttl;
    }

    public String getUserName(){return this.nama;}
    public String getUserAddress(){return this.alamat;}
    public String getUserPhoneNum(){return this.telepon;}
    public String getUserTTL(){return this.ttl;}

    public String toString(){
        return "Nama: " + this.nama + "\n"
             + "Alamat: " + this.alamat + "\n"
             + "No. Telp: " + this.telepon + "\n"
             + "TTL: " + this.ttl + "\n";
    }

    public String printUserData(String name, ArrayList<User> list){
        boolean found = false;
        int i;
        for (i = 0; i < list.size(); i++) {
            if (list.get(i).nama.equals(name)){
                found = true;
                break;
            }
        }
        if (found){
            return list.get(i).toString();
        }
            return "User not found!";
    }
}
