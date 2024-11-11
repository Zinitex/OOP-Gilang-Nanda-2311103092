/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.nanda.pkg2311103092;

import java.util.Scanner;

/**
 *
 * @author nanda
 */
public class OOPNanda2311103092 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        KomputerPremium kom1 = new KomputerPremium(20, "Warnet Gaming", 5000, false); 
        KomputerPremium kom2 = new KomputerPremium(20, "Warnet Gaming", 5000, true);        
        KomputerVIP kom3 = new KomputerVIP(15, "Warnet Gaming", 7000, false);
        KomputerVIP kom4 = new KomputerVIP(15, "Warnet Gaming", 7000, true); 
        
        String username = "Nanda";
        String password = "123123";
        boolean logged = false;
  
        do {
            System.out.print("Username\t: ");
            String akun = scanner.next();
            System.out.print("Password\t: ");
            String pass = scanner.next();
            
            if (akun.equals(username) && pass.equals(password)) {
                logged = true;
            } else {
                System.out.println("Username / Password Salah, coba ulang lagi.");
            }
        } while (!logged);
        
        kom1.informasi();
        kom2.informasi();
        kom3.informasi();
        kom4.informasi();
    }
    
}
