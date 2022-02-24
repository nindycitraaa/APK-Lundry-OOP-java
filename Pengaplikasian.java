/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

/**
 *
 * @author MOKLET-1
 */
public class Pengaplikasian {
    public static void main(String[] args) {
        // TODO code application logic here
        JenisLaundry jl = new JenisLaundry();
        Client client1 = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksi1 = new Transaksi();
        Laporan laporan1 = new Laporan();
        
        laporan1.laporan(jl);
        laporan1.laporan(client1);
        laporan1.laporan(transaksi1, jl);
        
        transaksi1.prosesTransaksi(client1, transaksi1, jl);
        
        laporan1.laporan(jl);
        laporan1.laporan(client1);
        laporan1.laporan(transaksi1, jl);  
        
    }
    
}

