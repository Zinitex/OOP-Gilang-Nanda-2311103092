/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.nanda.pkg2311103092;

/**
 *
 * @author Nanda Novianto Alfah Rizky
 */
public class KomputerVIP extends Komputer {

    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    public void informasi() {
        super.informasi();
        System.out.println("Status\t\t: " + (vipCard ? "Member VIP" : "Non VIP"));

        if (this.vipCard) {
            System.out.println("\nBenefit Memebr VIP:");
            System.out.println("- Diskon 10% untuk bermain diatas 3 Jam");
            System.out.println("- Gratis Minuam Setiap 4 Jam Bermain");
            System.out.println("- Prioritas Booking komptuer Gaming\n");
        }else{
            System.out.println("");
        }
        System.out.println("=========================");
    }

    public void login(String username) {
        System.out.println("User " + username + " logged in.");
    }

    public void bermain(int jam) {
        System.out.println("Playing for " + jam + " hours.");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Playing for " + jam + " hours and " + menitTambahan + " additional minutes.");
    }
}
