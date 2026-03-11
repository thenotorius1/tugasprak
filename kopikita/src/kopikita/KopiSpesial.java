/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author john
 */
public class KopiSpesial extends PesananKopi implements Refill {
        // Constructor
    public KopiSpesial(double hargaDasar) throws DataPesananTidakValidException {
        super(hargaDasar);
        this.namaKopi = "Kopi Spesial";
    }

    // Menghitung total harga
    @Override
    public double hitungTotalHarga() {
        return hargaDasar + 10000;
    }

    // Info refill
    @Override
    public void cetakInfoRefill() {
        System.out.println("Gratis Refill Sekali KopiKita");
    }
}

