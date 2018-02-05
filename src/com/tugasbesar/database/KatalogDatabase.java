/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import com.tugasbesar.impl.DaftarProdukDaoImpl;

import com.tugasbesar.service.DaftarProdukDao;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ajayfaul
 */
// KataLogDataBase
public class KatalogDatabase {
    
    private static Connection connection;

    private static DaftarProdukDao daftarProdukDao;
    
    
    public static Connection getConnection() throws SQLException{
        
        if (connection==null) {
            
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL("jdbc:mysql://localhost:3306/katalog");
            dataSource.setUser("root");
            dataSource.setPassword("");
            connection = dataSource.getConnection();
        }
        
        
        return connection;
        
    }
    
    public static DaftarProdukDao getDaftarProdukDao()throws SQLException{
        
        if (daftarProdukDao==null) {
            daftarProdukDao = new DaftarProdukDaoImpl(getConnection());
        }
        return daftarProdukDao;
        
    }
}
