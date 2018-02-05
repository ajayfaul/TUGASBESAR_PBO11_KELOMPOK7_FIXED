/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.entity;

import java.util.Objects;

/**
 *
 * @author Ajayfaul
 */
// Class Daftar Produk
public class DaftarProduk {
    
    private Integer idproduk;
    private String kategori;
    private String merk;
    private String namaproduk;
    private String spesifikasi;
    private String harga;
    
    public DaftarProduk() {

    }

    public DaftarProduk(String kategori, String merk, String namaproduk, String spesifikasi, String harga) {
        this.kategori = kategori;
        this.merk = merk;
        this.namaproduk = namaproduk;
        this.spesifikasi = spesifikasi;
        this.harga = harga;
    }


    public Integer getIdproduk() {
        return idproduk;
    }

    public void setIdproduk(Integer idproduk) {
        this.idproduk = idproduk;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getNamaproduk() {
        return namaproduk;
    }

    public void setNamaproduk(String namaproduk) {
        this.namaproduk = namaproduk;
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

    @Override
    // Int HashCode
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idproduk);
        hash = 89 * hash + Objects.hashCode(this.kategori);
        hash = 89 * hash + Objects.hashCode(this.merk);
        hash = 89 * hash + Objects.hashCode(this.namaproduk);
        hash = 89 * hash + Objects.hashCode(this.spesifikasi);
        hash = 89 * hash + Objects.hashCode(this.harga);
        return hash;
    }

    @Override
   // Public Boolean
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DaftarProduk other = (DaftarProduk) obj;
        if (!Objects.equals(this.kategori, other.kategori)) {
            return false;
        }
        if (!Objects.equals(this.merk, other.merk)) {
            return false;
        }
        if (!Objects.equals(this.namaproduk, other.namaproduk)) {
            return false;
        }
        if (!Objects.equals(this.spesifikasi, other.spesifikasi)) {
            return false;
        }
        if (!Objects.equals(this.harga, other.harga)) {
            return false;
        }
        if (!Objects.equals(this.idproduk, other.idproduk)) {
            return false;
        }
        return true;
    }
// void setvisible
    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
// void loadDatabase
    public void loadDatabase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
