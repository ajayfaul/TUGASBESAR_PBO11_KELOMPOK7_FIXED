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
 * @author rezaa
 */
public class TabelProdukCari extends AbstractTableModel{
    
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
        return 3;
    }

   

    public DaftarProduk get(int i) {
        return list.get(i);
    }
    
   public DaftarProduk set(int i, DaftarProduk e) {
        try {
            return list.set(i, e);
        } finally {
            fireTableRowsUpdated(i, i);
        }
    }

    public DaftarProduk remove(int i) {
        try {
            return list.remove(i);
        } finally {
            fireTableRowsDeleted(i, i);
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0 : return "NAMA_PRODUK";
            case 1 : return "SPESIFIKASI";
            case 2 : return "HARGA";
            default: return null;
        }
    }

    @Override
    public Object getValueAt(int i, int i1) {
        switch(i1){
            case 0 : return list.get(i).getNamaproduk();
            case 1 : return list.get(i).getSpesifikasi();
            case 2 : return list.get(i).getHarga();

            default: return null;
        }
    }


}
