package controller;

import model.*;
import java.util.ArrayList;
public class Controller {
    public Controller(){}

    public String printUserData(String nama, ArrayList<User> user){
        boolean found = false;
        int i;
        for (i = 0; i < user.size(); i++) {
            if (user.get(i).getUserName().equals(nama)){
                found = true;
                break;
            }
        }
        if (found){
            String text = "";
            if (user.get(i) instanceof Mahasiswa){
                if (user.get(i) instanceof Sarjana){
                    text = "Status: Mahasiswa Sarjana";
                }
                else if (user.get(i) instanceof Magister){
                    text = "Status: Mahasiswa Magister";
                }
                text = "Status: Mahasiswa Doktor";
            }
            else if (user.get(i) instanceof Dosen){
                if (user.get(i) instanceof DosenTetap){
                    text = "Status: Dosen Tetap";
                }
                else{
                    text = "Status: Dosen Honorer";
                }
            }
            else{
                text = "Status: Karyawan"; 
            }
            return user.get(i).toString() + text;
        }
        return "User not Found!";
    }

    public String printNilaiAkhir(String nim, String kodeMatkul, ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Mahasiswa){
                Mahasiswa temp = (Mahasiswa) list.get(i);
                if (temp.getMhsNIM().equals(nim)){
                    if (temp instanceof Doktor){
                        Doktor temp2 = (Doktor) temp;
                        return "Nama: " + temp2.getUserName() + "\nNilai Akhir: " + ((temp2.getDoktorNilaiS1()+temp2.getDoktorNilaiS2()+temp2.getDoktorNilaiS3())/3);
                    }
                    else if (temp instanceof Sarjana){
                        Sarjana temp2 = (Sarjana) temp;
                        ArrayList<MatkulAmbil> matkul = temp2.getSarjanaMatkul();
                        for (MatkulAmbil j : matkul) {
                            if (j.getMatkulCode().equals(kodeMatkul)){
                                return "Nama: " + temp2.getUserName() + "\nNilai Akhir: " + ((j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3);
                            }
                        }
                        return temp2.getUserName() + " tidak mengikuti matkul dengan kode " + kodeMatkul;
                    }
                    Magister temp2 = (Magister) temp;
                    ArrayList<MatkulAmbil> matkul = temp2.getMagisterMatkul();
                    for (MatkulAmbil j : matkul){
                        if (j.getMatkulCode().equals(kodeMatkul)){
                            return "Nama: " + temp2.getUserName() + "\nNilai Akhir: " + ((j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3);
                        }
                    }
                    return temp2.getUserName() + " tidak mengikuti matkul dengan kode " + kodeMatkul;
                }
            }
        }
        return "Tidak ada mahasiswa dengan nim " + nim;
    }

    public String printNilaiRata(String kodeMatkul, ArrayList<User> list){
        double total = 0, count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sarjana){
                Sarjana temp = (Sarjana) list.get(i);
                for (MatkulAmbil j : temp.getSarjanaMatkul()){
                    if (j.getMatkulCode().equals(kodeMatkul)){
                        total += (j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3;
                        count++;
                    }
                }
            }
            else if (list.get(i) instanceof Magister){
                Magister temp = (Magister) list.get(i);
                for (MatkulAmbil j : temp.getMagisterMatkul()){
                    if (j.getMatkulCode().equals(kodeMatkul)){
                        total += (j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3;
                        count++;
                    }
                }
            }
        }
        return "Nilai Rata-Rata Mahasiswa untuk matkul " + kodeMatkul + ": " + (total/count);
    }

    public String printMhsTidakLulus(String kodeMatkul, ArrayList<User> list){
        int count = 0, total = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Sarjana){
                Sarjana temp = (Sarjana) list.get(i);
                for (MatkulAmbil j : temp.getSarjanaMatkul()){
                    if (j.getMatkulCode().equals(kodeMatkul)){
                        total++;
                        if ((j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3 < 56){count++;}
                    }
                }
            }
            else if (list.get(i) instanceof Magister){
                Magister temp = (Magister) list.get(i);
                for (MatkulAmbil j : temp.getMagisterMatkul()){
                    if (j.getMatkulCode().equals(kodeMatkul)){
                        total++;
                        if ((j.getMatkulAmbilNilai1()+j.getMatkulAmbilNilai2()+j.getMatkulAmbilNilai3())/3 < 56){count++;}
                    }
                }
            }
        }

        return count + " dari " + total + " mahasiswa tidak lulus matakuliah " + kodeMatkul;
    }

    public String printMatkulAmbilMhs(String nim, ArrayList<User> list){
        String text = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Mahasiswa){
                Mahasiswa temp = (Mahasiswa) list.get(i);
                ArrayList<MatkulAmbil> matkuls = new ArrayList<MatkulAmbil>();
                if (temp.getMhsNIM().equals(nim)){
                    if (temp instanceof Sarjana){
                        Sarjana temp2 = (Sarjana) temp;
                        matkuls = temp2.getSarjanaMatkul();
                    }
                    else if (temp instanceof Magister){
                        Magister temp2 = (Magister) temp;
                        matkuls = temp2.getMagisterMatkul();
                    }
                }
                for (int j = 0; j < matkuls.size(); j++) {
                    int count = 0;
                    for(Presensi k : matkuls.get(j).getMatkulAmbilPresensi()){
                        if (k.getPresensiStatus() == Status.HADIR){count++;}
                    }
                    text += (j+1) + ". " + matkuls.get(j).getMatkulNama() + " => Total Presensi " + count + "\n";
                }
            }
        }

        return "List Matkul yang diambil oleh siswa dengan nim " + nim + ":\n" + text;
    }

    public String printTotalJamDosen(String nik, ArrayList<User> list){
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) instanceof Dosen){
                Dosen temp = (Dosen) list.get(index);
                if (temp.getStaffNIK().equals(nik)){
                    int count = 0;
                    for (MatkulAjar i : temp.getDosenMatkulAjar()){
                        for (PresensiStaff j : i.getMatkulAjarPresensi()){
                            if (j.getPresensiStatus() == Status.HADIR){count += j.getPresensiStaffJam();}
                        }
                    }
                    return "Jumlah jam mengajar " + temp.getUserName() + ": " + count;
                }
            }
        }
        return "Tidak ada Dosen dengan nik tersebut!";
    }

    public String printGajiStaff(String nik, ArrayList<User> list){
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index) instanceof Staff){
                Staff temp = (Staff) list.get(index);
                if (temp.getStaffNIK().equals(nik)){
                    if (temp instanceof Karyawan){
                        Karyawan temp2 = (Karyawan) temp;
                        int unit = 0;
                        for(PresensiStaff j : temp2.getKaryawanPresensi()){
                            if (j.getPresensiStatus() == Status.HADIR){unit++;}
                        }
                        return "Gaji Karyawan " + temp2.getUserName() + ": " + (unit/22*temp2.getKaryawanSalary());
                    }
                    else if (temp instanceof DosenTetap){
                        DosenTetap temp2 = (DosenTetap) temp;
                        int unit = 0;
                        for (MatkulAjar i : temp2.getDosenMatkulAjar()){
                            for (PresensiStaff j : i.getMatkulAjarPresensi()){
                                if (j.getPresensiStatus() == Status.HADIR){unit++;}
                            }
                        }
                        return "Gaji Dosen Tetap " + temp2.getUserName() + ": " + (temp2.getDosenTetapSalary() + unit*25000);
                    }
                    DosenHonorer temp2 = (DosenHonorer) temp;
                    int unit = 0;
                    for (MatkulAjar i : temp2.getDosenMatkulAjar()){
                        for (PresensiStaff j : i.getMatkulAjarPresensi()){
                            if (j.getPresensiStatus() == Status.HADIR){unit++;}
                        }
                    }
                    return "Gaji Dosen Tetap " + temp2.getUserName() + ": " + (temp2.getDosenHonorerHonorPerSKS()*unit);
                }
            }
        }
        return "Tidak ada Staff dengan nik tersebut!";
    }
}
