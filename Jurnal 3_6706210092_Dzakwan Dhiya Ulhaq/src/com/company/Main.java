package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
        Scanner input = new Scanner(System.in);

        String inputNip; //Untuk input Nip Pegawai
        String inputNama; //Untuk input Nama Pegawai
        String inputDivisi; //Untuk input Divisi Pegawai
        String pilihanInput; //Untuk memilih posisi data yang akan disimpan
        int daftarMenu = 0; //Untuk memilih opsi menu utama
        int opsiHapus = 0; //Untuk memilih opsi data yang akan dihapus

        //Membuat Daftar Menu
        while(daftarMenu != 4){
            System.out.println("Pilih menu: ");
            System.out.println("1. Input data");
            System.out.println("2. Hapus data");
            System.out.println("3. Cek list pegawai");
            System.out.println("4. Keluar");
            daftarMenu = input.nextInt();

            //Opsi 1. Input data
            if(daftarMenu == 1){
                System.out.println("Masukkan data");
                System.out.println("Tuliskan nip, nama dan divisi pegawai");
                inputNip = input.next();
                inputNama = input.next();
                inputDivisi = input.next();

                //Opsi Input Posisi Data
                System.out.println("Tambahkan data di awal list? (y/n))");
                pilihanInput = input.next();

                if(pilihanInput.equals("y")){
                    linkedList.inputDiawal(new Pegawai(inputNip, inputNama, inputDivisi));
                }

                if(pilihanInput.equals("n")){
                    linkedList.inputDiakhir(new Pegawai(inputNip, inputNama, inputDivisi));
                }

            }

            //Opsi 2. Hapus data
            else if(daftarMenu == 2){
                System.out.println("Pilih opsi data yang akan dihapus:");
                System.out.println("1. Data Pertama");
                System.out.println("2. Data Terakhir");
                opsiHapus = input.nextInt();

                //Opsi Hapus Posisi Data
                if(opsiHapus == 1){
                    linkedList.hapusDataPertama();
                }

                else if(opsiHapus == 2){
                    linkedList.hapusDataTerakhir();
                }

            }

            //Opsi 3. Cek list pegawai
            else if(daftarMenu == 3){
                linkedList.print();
            }

        }

    }

}





