/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.nanda.pkg2311103092;

import java.util.Scanner;

/**
 *
 * @author Nanda Novianto Alfah Rizky
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Object[][] accounts = {
            {"Nanda", "123123", true},
            {"Nindi", "123123", false},
            {"Nandi", "123123", true}
        };
        
        KomputerPremium kom1 = new KomputerPremium(33, "Warnet Gaming", 5000, false); 
        KomputerPremium kom2 = new KomputerPremium(44, "Warnet Gaming", 5000, true);        
        KomputerVIP kom3 = new KomputerVIP(55, "Warnet Gaming", 7000, false);
        KomputerVIP kom4 = new KomputerVIP(66, "Warnet Gaming", 7000, true); 
        
        String username = "a";
        boolean logged = false;
        boolean isVIP = false;
  
        do {
            System.out.println("");
            System.out.print("Username: ");
            String inputUsername = scanner.next();
            System.out.print("Password: ");
            String inputPassword = scanner.next();
            
            for (Object[] account : accounts) {
                String storedUsername = (String) account[0];
                String storedPassword = (String) account[1];
                boolean storedIsVIP = (boolean) account[2];

                if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
                    username = storedUsername;
                    logged = true;
                    isVIP = storedIsVIP;
                    System.out.println("");
                    break; 
                }
            }

            if (!logged) {
                System.out.println("Username atau Password salah, silahkan coba lagi.");
            }
        } while (!logged);
        
        System.out.println("Selamat Datang, " + username + "\nAnda adalah " + (isVIP ? "Member VIP" : "Member Standar"));
        
        System.out.println("");
        kom1.informasi();
        kom2.informasi();
        kom3.informasi();
        kom4.informasi();
        
        while (true) {
            System.out.println("\nMenu Pilihan:");
            System.out.println("1. Bermain Komputer");
            System.out.println("2. Pesan Komputer");
            System.out.println("3. Tambah Layanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan durasi bermain (jam): ");
                    int jam = scanner.nextInt();
                    if (isVIP) {
                        kom3.bermain(jam);
                    }
                    break;
                    
                case 2:
                    System.out.print("Masukkan nomor komputer yang ingin dipesan: ");
                    int nomorKomputer = scanner.nextInt();
                    if (!isVIP) {
                        kom1.pesan(nomorKomputer);
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan makanan yang ingin ditambah: ");
                    String makanan = scanner.next();
                    System.out.print("Apakah Anda ingin menambahkan minuman? (y/n): ");
                    String tambahMinuman = scanner.next();
                    if (tambahMinuman.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan minuman yang ingin ditambah: ");
                        String minuman = scanner.next();
                        if (!isVIP) {
                            kom1.tambahLayanan(makanan, minuman);
                        }
                    } else {
                        if (!isVIP) {
                            kom1.tambahLayanan(makanan);
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    
    }
    
}
