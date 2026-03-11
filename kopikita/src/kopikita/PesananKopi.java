/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kopikita;

/**
 *
 * @author john
 */
public abstract class PesananKopi {
    
    protected String namaKopi;
    protected double hargaDasar;

    // Constructor
    public PesananKopi(double hargaDasar) throws DataPesananTidakValidException {

        if (hargaDasar <= 0) {
            throw new DataPesananTidakValidException("Harga dasar tidak boleh 0 atau negatif!");
        }

        this.hargaDasar = hargaDasar;
    }

    // Getter
    public String getNamaKopi() {
        return namaKopi;
    }

    public double getHargaDasar() {
        return hargaDasar;
    }

    // Method abstract
    public abstract double hitungTotalHarga();
}