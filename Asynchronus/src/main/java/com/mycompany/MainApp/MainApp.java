/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.MainApp;

/**
 *
 * @author Zammbss
 */
public class MainApp {
    public static void MainApp(String[] args) {
        komputer komputer = new komputer(10, "Warnet A", 5000);
        komputer.informasi();

        KomputerVIP komputerVIP = new KomputerVIP(5, "Warnet B", 7000, true);
        komputerVIP.informasi();
        komputerVIP.login("userVIP");
        komputerVIP.bermain(2);
        komputerVIP.bermain(1, 30);

        KomputerPremium KomputerPremium = new KomputerPremium (3, "Warnet C", 10000, true);
        KomputerPremium.informasi();
        KomputerPremium.pesan(1);
        KomputerPremium.tambahanLayanan("Snack");
        KomputerPremium.tambahLayanan("Snack", "Minuman");
    }
}
