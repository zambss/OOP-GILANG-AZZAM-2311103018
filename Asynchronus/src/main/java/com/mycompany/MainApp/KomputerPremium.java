/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MainApp;
/**
 *
 * @author Zammbss
 */
class KomputerPremium extends komputer {
    protected boolean ruangPrivat;
    
    public KomputerPremium (int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }
    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status: Komputer Premium");
        if (ruangPrivat) {
            System.out.println("Ruang: Privat");
        } else {
            System.out.println("Ruang: Umum");
        }
    }
    public void pesan(int nomorKomputer) {
        System.out.println("Pesan komputer nomor: " + nomorKomputer);
    }
    public void tambahanLayanan(String makanan) {
        System.out.println("Pesan tambahan layanan: " + makanan);
    }
    public void tambahLayanan(String makanan, String minuman) {
        System.out.println("Pesan tambahan layanan: " + makanan + " dan " + minuman);
    }
}
