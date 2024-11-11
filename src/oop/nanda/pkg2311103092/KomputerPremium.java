/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.nanda.pkg2311103092;

/**
 *
 * @author Nanda Novianto Alfah Rizky
 */
public class KomputerPremium extends Komputer {
    protected boolean ruangPrivat;

    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    public void informasi() {
        super.informasi();
        System.out.println("Status\t\t: " + (ruangPrivat ? "Ruangan Premium" : "Ruangan Standar"));
        
        if (this.ruangPrivat) {
            System.out.println("\nFasilitas Ruang Permium:");
            System.out.println("- Ruangan ber-AC Pribadi");
            System.out.println("- Komputer Spesifikasi Tinggi");
            System.out.println("- Koneksi Internet Dedicated 100Mbps\n");
        }else{
            System.out.println("\nFasilitas Ruang Standar:");
            System.out.println("- Ruangan Gerah");
            System.out.println("- Komputer Spesifikasi Rendah");
            System.out.println("- Koneksi internet dedicated 1Mbps\n");
        };
        System.out.println("=========================");
    }

    public void pesan(int nomorKomputer) {
        System.out.println("Computer number " + nomorKomputer + " has been reserved.");
    }

    public void tambahLayanan(String makanan) {
        System.out.println("Added service: Food - " + makanan);
    }

    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Added service: Food - " + makanan + ", Drink - " + minuman);
    }
}
