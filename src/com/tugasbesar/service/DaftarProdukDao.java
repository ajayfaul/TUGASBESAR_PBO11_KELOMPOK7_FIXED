/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.service;

import com.tugasbesar.entity.DaftarProduk;
import com.tugasbesar.error.DaftarProdukException;
import java.util.List;

/**
 *
 * @author Ajayfaul
 */
public interface DaftarProdukDao {
    
    public void insertDaftarProduk(DaftarProduk daftarproduk)throws DaftarProdukException;
    
    public DaftarProduk getProduk(String kategori) throws DaftarProdukException;
    
    public DaftarProduk getProduk1(Integer id_produk) throws DaftarProdukException;
    
    public DaftarProduk getProduk2(String merk_produk) throws DaftarProdukException;
    
    public DaftarProduk getProduk3(String nama_produk) throws DaftarProdukException;

    public List<DaftarProduk> selectAllDaftarProduk() throws DaftarProdukException;

    public List<DaftarProduk> selectCariProduk (String nama) throws DaftarProdukException;
    
    
}
