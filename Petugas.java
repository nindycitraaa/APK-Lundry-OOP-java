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

public class Petugas implements User {
   

 private ArrayList<String> namaPetugas = new ArrayList<String>();
 private ArrayList<String> alamat = new ArrayList<String>();
 private ArrayList<String> telepon = new ArrayList<String>();
 private ArrayList<Integer> jabatan = new ArrayList<Integer>();
 
 public Petugas() {
 this.namaPetugas.add("Nindy");
 this.alamat.add("Probolinggo");
 this.telepon.add("08123493540");
 this.jabatan.add(0);
 }
 public void setJabatan(int jabatan ){
 this.jabatan.add(jabatan);
 }
 public int getJabatan(int id){
 return this.jabatan.get(id);
 } 
 public int getJmlPetugas(){
 return this.namaPetugas.size();
 } 
 @Override
 public void setNama(String namaPetugas ){
 this.namaPetugas.add(namaPetugas);
 }
 
 @Override
 public void setAlamat(String alamat ){
 this.namaPetugas.add(alamat);
 }
 @Override
 public void setTelepon(String telepon ){
 this.namaPetugas.add(telepon);
 }
 
 @Override
 public String getNama(int idPetugas){
 return this.namaPetugas.get(idPetugas);
 }
 
 @Override
 public String getAlamat(int idPetugas){
 return this.alamat.get(idPetugas);
 }
 
 @Override
 public String getTelepon(int idPetugas){
 return this.telepon.get(idPetugas);
 }   
    
}




