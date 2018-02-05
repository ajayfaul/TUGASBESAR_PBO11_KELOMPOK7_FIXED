/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.model;

import com.tugasbesar.database.KatalogDatabase;
import com.tugasbesar.entity.DaftarProduk;
import com.tugasbesar.error.DaftarProdukException;
import com.tugasbesar.event.ProdukListener;
import com.tugasbesar.service.DaftarProdukDao;
import java.sql.SQLException;

/**
 *
 * @author Ajayfaul
 */
public class DaftarProdukModel {
    private int id_produk;
    private String kategori_produk;
    private String merk_produk;
    private String nama_produk;
    private String spesifikasi;
    private String harga;
    
    private ProdukListener listener;
    
    private ProdukListener getListener(){
        return listener;
    }
     public void setListener(ProdukListener listener) {
        this.listener = listener;
    }    
    

    public int getId_produk() {
        return id_produk;
    }

    public void setId_produk(int id_produk) {
        this.id_produk = id_produk;
    }

    public String getKategori_produk() {
        return kategori_produk;
    }

    public void setKategori_produk(String kategori_produk) {
        this.kategori_produk = kategori_produk;
    }

    public String getMerk_produk() {
        return merk_produk;
    }

    public void setMerk_produk(String merk_produk) {
        this.merk_produk = merk_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    
    protected void fireOnInsert(DaftarProduk daftarProduk){
        if (listener!=null) {
            listener.onInsert(daftarProduk);
        }
    }
    
     public void cariProduk(String nama) throws SQLException, DaftarProdukException{
        DaftarProdukDao dao = KatalogDatabase.getDaftarProdukDao();
        DaftarProduk daftarProduk = new DaftarProduk();
        dao.selectCariProduk(nama);
        fireOnInsert(daftarProduk);
    }
  
}
