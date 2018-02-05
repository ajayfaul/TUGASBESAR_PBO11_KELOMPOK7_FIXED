/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.event;

import com.tugasbesar.entity.DaftarProduk;
import com.tugasbesar.model.DaftarProdukModel;

/**
 *
 * @author rezaa
 */
public interface ProdukListener {
    public void onChange(DaftarProdukModel model);
    public void onInsert(DaftarProduk daftarProduk);
    
}
