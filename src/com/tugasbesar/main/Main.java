/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.main;

import com.tugasbesar.view.Mainmenu;
import com.tugasbesar.entity.DaftarProduk;
import com.tugasbesar.error.DaftarProdukException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;

/**
 *
 * @author Ajayfaul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, DaftarProdukException{
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                {
                    try {
                        Mainmenu daftarProduk = new Mainmenu();
                        daftarProduk.loadDatabase();
                        daftarProduk.setVisible(true);
                    } catch (SQLException e) {
                    } catch (DaftarProdukException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    });
  }
}