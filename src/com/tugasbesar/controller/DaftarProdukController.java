/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.controller;

import com.tugasbesar.error.DaftarProdukException;
import com.tugasbesar.model.DaftarProdukModel;
import com.tugasbesar.model.TabelProdukCari;
import com.tugasbesar.view.Mainmenu;
import java.sql.SQLException;

/**
 *
 * @author Ajayfaul
 * DAFTAR PRODUK 
 * Class DaftarProdukController
 */
public class DaftarProdukController {
    
    private DaftarProdukModel model;
    
    public void setModel(DaftarProdukModel model) {
        this.model = model;
    }
   // Void Cari Produk
    
