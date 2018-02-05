/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.model;

import com.tugasbesar.entity.DaftarProduk;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ajayfaul
 */
public class TabelDaftarProdukModel extends AbstractTableModel{
    
    private List<DaftarProduk> list = new ArrayList<DaftarProduk>();

    public void setList(List<DaftarProduk> list) {
        this.list = list;
        
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }
    
     @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "ID_PRODUK";
            case 1 : return "KATEGORI_PRODUK";
            case 2 : return "MERK_PRODUK";
            case 3 : return "NAMA_PRODUK";
            case 4 : return "SPESIFIKASI";
            case 5 : return "HARGA";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0 : return list.get(rowIndex).getIdproduk();
            case 1 : return list.get(rowIndex).getKategori();
            case 2 : return list.get(rowIndex).getMerk();
            case 3 : return list.get(rowIndex).getNamaproduk();
            case 4 : return list.get(rowIndex).getSpesifikasi();
            case 5 : return list.get(rowIndex).getHarga();
            default: return null;
        }
    }
    
}
