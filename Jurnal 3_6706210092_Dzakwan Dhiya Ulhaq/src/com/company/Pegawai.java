package com.company;

public class Pegawai {
    private String nip;
    private String nama;
    private String divisi;

    public Pegawai(String nip, String nama, String kelas) {
        this.nip = nip;
        this.nama = nama;
        this.divisi = kelas;
    }


    @Override
    public String toString() {
        return	("pegawai{nip='" + nip + '\'' + ", nama='" + nama + '\'' + ", divisi='" + divisi + '\'' + "}") ;
    }

}
