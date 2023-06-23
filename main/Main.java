package main;
import java.util.ArrayList;

import model.*;
import view.MainMenu;

public class Main {
    public static ArrayList<Matkul> matkul = new ArrayList<Matkul>(){
        {
            add(new Matkul("Sistem Informasi", "SI-381", 2));
            add(new Matkul("Algoritma dan Pemrograman", "IF-104", 3));
            add(new Matkul("Sistem Berkas", "IF-303", 2));
            add(new Matkul("Struktur Data", "IF-201", 3));
            add(new Matkul("Desain Web", "IF-1P3", 2));
            add(new Matkul("Pemrograman Web", "IF-2P4", 2));
            add(new MatkulPilihan("Kalkulus II", "KU-202", 3, 10));
            add(new Matkul("Probabilitas dan Statistika II", "TI-794", 2));
            add(new Matkul("Pengantar Teknologi Informasi", "IF-105", 2));
        }
    };
    public static ArrayList<PresensiStaff> presensiStaff = new ArrayList<PresensiStaff>(){
        {
            add(new PresensiStaff("02-11-2022", Status.ALPHA, 5));
            add(new PresensiStaff("01-11-2022", Status.HADIR, 5));
            add(new PresensiStaff("04-11-2022", Status.HADIR, 5));
            add(new PresensiStaff("06-11-2022", Status.HADIR, 5));
        }
    };
    public static ArrayList<MatkulAjar> matkulAjar = new ArrayList<MatkulAjar>(){
        {
            add(new MatkulAjar("Struktur Data", "IF-201", 3, new ArrayList<PresensiStaff>(presensiStaff.subList(0, 2))));
            add(new MatkulAjar("Praktikum Struktur Data", "IF-2P1", 3, new ArrayList<PresensiStaff>(presensiStaff.subList(2, 3))));
            add(new MatkulAjar("English II", "KU-201", 2, new ArrayList<PresensiStaff>(presensiStaff.subList(3, 4))));
        }
    };
    public static ArrayList<Dosen> dosen = new ArrayList<Dosen>(){
        {
            add(new DosenTetap("Bu Inge", "Jl. Sempuy", "123412341231", "Bandung, 11-10-1979", "119079", "Informatika", new ArrayList<MatkulAjar>(matkulAjar.subList(0, 2)), 12000000));
            add(new DosenHonorer("Bu Vina", "Jl. Batununggal", "123412341233", "Bandung, 11-10-1981", "119081", "Supply Chain Management", new ArrayList<MatkulAjar>(matkulAjar.subList(2, 3)), 2000000));
        }
    };
    public static ArrayList<Presensi> presensi = new ArrayList<Presensi>(){
        {
            add(new Presensi("09-11-2022", Status.HADIR));
            add(new Presensi("08-11-2022", Status.HADIR));
            add(new Presensi("07-11-2022", Status.HADIR));
            add(new Presensi("06-11-2022", Status.HADIR));
            add(new Presensi("05-11-2022", Status.ALPHA));
            add(new Presensi("04-11-2022", Status.HADIR));
            add(new Presensi("03-11-2022", Status.ALPHA));
        }
    };
    public static ArrayList<Karyawan> karyawan = new ArrayList<Karyawan>(){
        {
            add(new Karyawan("Pa Rusli", "Jl. Jumanji", "092212341234", "Bandung, 12-04-1987", "219901", 6000000, new ArrayList<PresensiStaff>(presensiStaff.subList(0, 2))));
            add(new Karyawan("Pa Hadinoto", "Jl. Pungkur", "092212341233", "Bandung, 12-04-1977", "219902", 6000000, new ArrayList<PresensiStaff>(presensiStaff.subList(2, 4))));
        }
    };
    public static ArrayList<MatkulAmbil> matkulAmbil = new ArrayList<MatkulAmbil>(){
        {
            add(new MatkulAmbil("Praktikum Pemrograman Berorientasi Objek", "IF-3P1", 3, new ArrayList<Presensi>(presensi.subList(0, 3)), 89.88, 91.78, 87.65));
            add(new MatkulAmbil("Pemrograman Berorientasi Objek", "IF-301", 3, new ArrayList<Presensi>(presensi.subList(3, 5)), 98.7, 78.9, 88.7));
            add(new MatkulAmbil("Dasar Akuntansi", "AK-296", 2, new ArrayList<Presensi>(presensi.subList(5, 7)), 50, 67.78, 77.77));
            add(new MatkulAmbil("Pemrograman Berorientasi Objek", "IF-301", 3, new ArrayList<Presensi>(presensi.subList(3, 5)), 23, 22, 12));
        }
    };
    public static ArrayList<User> users = new ArrayList<User>(){
        {
            add(new Sarjana("Dedi", "Jl. Sulaiman", "081212349876", "Pintang, 12-12-1997", "111021", "Informatika", new ArrayList<MatkulAmbil>(matkulAmbil.subList(0, 2))));
            add(new Magister("Judi", "Jl. Asituy", "081212349877", "Pintang, 11-12-1997", "111022", "Informatika", new ArrayList<MatkulAmbil>(matkulAmbil.subList(2, 4)), "Indahnya Pegunungan"));
            add(new Doktor("Adi", "Jl. Saritem", "081212349871", "Buntang, 12-12-1997", "111023", "Informatika", "Asiknya Bermain", 78.78, 77.89, 82.31));
            for(Dosen i : dosen){add(i);}
            for(Karyawan i : karyawan){add(i);}
        }
    };
    
    public static void main(String[] args) {
        new MainMenu();
    }
}
