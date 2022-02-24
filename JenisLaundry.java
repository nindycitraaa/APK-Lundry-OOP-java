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
import java.util.ArrayList;
public class JenisLaundry {
    

    
private ArrayList<String> jenisLaundry = new ArrayList<String>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();
 private ArrayList<Integer> durasi = new ArrayList<Integer>();
 
 public JenisLaundry() {
 this.jenisLaundry.add("Cuci Kering+Strika");
 this.harga.add(10000);
 this.durasi.add(3);
 
 this.jenisLaundry.add("Cuci Kering");
 this.harga.add(5000);
 this.durasi.add(2);
 
 this.jenisLaundry.add("Cuci Basah");
 this.harga.add(15000);
 this.durasi.add(1);
 
 }
 public int getJmlLaundry(){
 return this.jenisLaundry.size();
 }
 public void setJenisLaundry(String jenisLaundry ){
 this.jenisLaundry.add(jenisLaundry);
 }
 public String getJenisLaundry(int idLaundry){
 return this.jenisLaundry.get(idLaundry);
 } 
 
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idLaundry){
 return this.harga.get(idLaundry);
 } 
// public void editStok(int idBarang, int stok){
// this.stok.set(idBarang, stok);;
// } 
 public void setDurasi(int durasi ){
 this.durasi.add(durasi);
 }
 public int getDurasi(int idLaundry){
 return this.durasi.get(idLaundry);
 } 
}



