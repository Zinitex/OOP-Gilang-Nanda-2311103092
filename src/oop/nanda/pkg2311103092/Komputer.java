/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.nanda.pkg2311103092;

/**
 *
 * @author Nanda Novianto Alfah Rizky
 */
public class Komputer {
    int idKomputer;
    String namaWarnet;
    float hargaPerJam;
    
    public Komputer(int idKomputer, String namaWarnet, float hargaPerJam) {
        this.idKomputer = idKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    public void informasi() {
        System.out.println("INFORMASI KOMPUTER");
        System.out.println("Id Komputer\t: " + idKomputer);
        System.out.println("Nama Warnet\t: " + namaWarnet);
        System.out.println("Harga per Jam\t: Rp " + hargaPerJam);
    }
}
