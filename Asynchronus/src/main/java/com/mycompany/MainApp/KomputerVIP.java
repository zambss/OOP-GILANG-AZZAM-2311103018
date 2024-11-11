/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.MainApp;

/**
 *
 * @author Zammbss
 */
class KomputerVIP extends komputer {
    protected boolean vipCard;

    public KomputerVIP(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean vipCard) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.vipCard = vipCard;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Status: Member VIP");
        if (vipCard) {
            System.out.println("Benefit Member VIP:");
            System.out.println("- Diskon 18% untuk bermain di atas 3 jam");
            System.out.println("- Gratis minuman setiap 4 jam bermain");
            System.out.println("- Prioritas booking komputer gaming");
        } else {
            System.out.println("Benefit Member VIP: jgn ngarep benefit, maav :)");
        }
    }

    public void login(String username) {
        System.out.println("Login dengan username: " + username);
    }

    public void bermain(int jam) {
        System.out.println("Bermain selama " + jam + " jam");
    }

    public void bermain(int jam, int menitTambahan) {
        System.out.println("Bermain selama " + jam + " jam " + menitTambahan + " menit");
    }
}

