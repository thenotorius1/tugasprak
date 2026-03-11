/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kopikita;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Pelanggan> pelangganList = new ArrayList<>();
        ArrayList<PesananKopi> pesananList = new ArrayList<>();

        int menu;

        do {

            System.out.println("=== SISTEM KASIR KEDAI KOPI - KopiKita ===");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu: ");
            menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {

                System.out.println("\n--- Data Pelanggan ---");

                System.out.print("Nama : ");
                String nama = input.nextLine();

                System.out.print("Nomor Meja : ");
                String meja = input.nextLine();

                if (!meja.matches("[0-9]+")) {
                    System.out.println("[ERROR] Nomor meja hanya boleh berisi angka!\n");
                    continue;
                }

                System.out.println("\n--- Data Pesanan ---");

                System.out.print("Harga Dasar : ");
                double harga = input.nextDouble();

                if (harga <= 0) {
                    System.out.println("[ERROR] Harga dasar harus lebih dari 0!\n");
                    continue;
                }

                System.out.print("Jenis Kopi (1. Regular / 2. Spesial): ");
                int jenis = input.nextInt();
                input.nextLine();

                Pelanggan p = new Pelanggan(nama, meja);
                PesananKopi k;

                try {

                    if (jenis == 1) {
                        k = new KopiRegular(harga);
                    } else {
                        k = new KopiSpesial(harga);
                    }

                    pelangganList.add(p);
                    pesananList.add(k);

                    System.out.println("[OK] Pesanan berhasil ditambahkan!\n");

                } catch (Exception e) {
                    System.out.println("[ERROR] " + e.getMessage());
                }

            }

        } while (menu != 2);

        System.out.println("\n=========== REKAP PESANAN ===========");

        for (int i = 0; i < pelangganList.size(); i++) {

            Pelanggan p = pelangganList.get(i);
            PesananKopi k = pesananList.get(i);

            System.out.println("Pelanggan : " + p.getNama());
            System.out.println("Pesanan   : " + k.getNamaKopi());
            System.out.println("Total     : Rp " + (int) k.hitungTotalHarga());

            if (k instanceof Refill) {
                System.out.print("Refill    : ");
                ((Refill) k).cetakInfoRefill();
            } else {
                System.out.println("Refill    : -");
            }

            System.out.println("--------------------------------");
        }
    }
}