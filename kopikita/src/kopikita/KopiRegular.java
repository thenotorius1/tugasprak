/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author john
 */
    public class KopiRegular extends PesananKopi {

    // Constructor
    public KopiRegular(double hargaDasar) throws DataPesananTidakValidException {
        super(hargaDasar);
        this.namaKopi = "Kopi Regular";
    }

    // Menghitung total harga
    @Override
    public double hitungTotalHarga() {
        return hargaDasar;
    }
}