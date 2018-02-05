/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.impl;

import com.tugasbesar.entity.DaftarProduk;
import com.tugasbesar.error.DaftarProdukException;
import com.tugasbesar.service.DaftarProdukDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Ajayfaul
 */
public class DaftarProdukDaoImpl implements DaftarProdukDao{
    
    
    private Connection connection;
    
    private final String insertDaftarProduk = "INSERT INTO DAFTARPRODUK (KATEGORI_PRODUK,MERK_PRODUK,NAMA_PRODUK,SPESIFIKASI,HARGA) VALUES (?,?,?,?,?)";
    
    private final String getByKategori = "SELECT * FROM DAFTARPRODUK WHERE KATEGORI_PRODUK=?";
    
    private final String getByID = "SELECT * FROM DAFTARPRODUK WHERE ID_PRODUK=?";
    
    private final String getByMerk_produk = "SELECT * FROM DAFTARPRODUK WHERE MERK_PRODUK=?";
    
    private final String getByNama_produk= "SELECT * FROM DAFTARPRODUK WHERE NAMA_PRODUK=?";
    
    private final String selectAll = "SELECT * FROM DAFTARPRODUK";
    
    private final String pencarian = "SELECT * FROM DAFTARPRODUK WHERE NAMA_PRODUK LIKE '?%'";
    
    
    
    
    public  DaftarProdukDaoImpl (Connection connection) {
        this.connection = connection;
    }

    @Override
    public void insertDaftarProduk(DaftarProduk daftarproduk) throws DaftarProdukException {
       PreparedStatement statement =null;
        try {
            connection.setAutoCommit(false);
            
            statement = connection.prepareStatement(insertDaftarProduk);
            statement.setString(1,daftarproduk.getKategori());
            statement.setString(2,daftarproduk.getMerk());
            statement.setString(3,daftarproduk.getNamaproduk());
            statement.setString(4,daftarproduk.getSpesifikasi());
            statement.setString(5,daftarproduk.getHarga());
            
            statement.executeUpdate();
            
            connection.commit();
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(e.getMessage());
        }finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                }
            }

        }
    
    }

    @Override
    public DaftarProduk getProduk(String kategori) throws DaftarProdukException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByKategori);

            statement.setString(1, kategori);

            ResultSet result = statement.executeQuery();
            DaftarProduk daftarProduk = null;
            if (result.next()) {
                daftarProduk = new DaftarProduk();
                daftarProduk.setIdproduk(result.getInt("ID_PRODUK"));
                daftarProduk.setKategori(result.getString("KATEGORI_PRODUK"));
                daftarProduk.setMerk(result.getString("MERK_PRODUK"));
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));
            } else {
                throw new DaftarProdukException("Produk dengan kategori "
                        + kategori + " tidak ditemukan");
            }
            connection.commit();
            return daftarProduk;

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public List<DaftarProduk> selectAllDaftarProduk() throws DaftarProdukException {
        Statement statement = null;
        List<DaftarProduk> list = new ArrayList<DaftarProduk>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();

            ResultSet result = statement.executeQuery(selectAll);
            while (result.next()) {
                DaftarProduk daftarProduk = new DaftarProduk();
                daftarProduk.setIdproduk(result.getInt("ID_PRODUK"));
                daftarProduk.setKategori(result.getString("KATEGORI_PRODUK"));
                daftarProduk.setMerk(result.getString("MERK_PRODUK"));
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));

                list.add(daftarProduk);
            }
            connection.commit();
            return list;
        } catch (SQLException exception) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(exception.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }

        }
    }

    @Override
    public DaftarProduk getProduk1(Integer id_produk) throws DaftarProdukException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByID);

            statement.setInt(1, id_produk);

            ResultSet result = statement.executeQuery();
            DaftarProduk daftarProduk = null;
            if (result.next()) {
                daftarProduk = new DaftarProduk();
                daftarProduk.setIdproduk(result.getInt("ID_PRODUK"));
                daftarProduk.setKategori(result.getString("KATEGORI_PRODUK"));
                daftarProduk.setMerk(result.getString("MERK_PRODUK"));
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));
            } else {
                throw new DaftarProdukException("Produk dengan ID "
                        + id_produk + " tidak ditemukan");
            }
            connection.commit();
            return daftarProduk;

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public DaftarProduk getProduk2(String merk_produk) throws DaftarProdukException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByMerk_produk);

            statement.setString(1, merk_produk);

            ResultSet result = statement.executeQuery();
            DaftarProduk daftarProduk = null;
            if (result.next()) {
                daftarProduk = new DaftarProduk();
                daftarProduk.setIdproduk(result.getInt("ID_PRODUK"));
                daftarProduk.setKategori(result.getString("KATEGORI_PRODUK"));
                daftarProduk.setMerk(result.getString("MERK_PRODUK"));
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));
            } else {
                throw new DaftarProdukException("Produk dengan Merk "
                        + merk_produk + " tidak ditemukan");
            }
            connection.commit();
            return daftarProduk;

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public DaftarProduk getProduk3(String nama_produk) throws DaftarProdukException {
        PreparedStatement statement = null;
        try {
            connection.setAutoCommit(false);
            statement = connection.prepareStatement(getByNama_produk);

            statement.setString(1, nama_produk);

            ResultSet result = statement.executeQuery();
            DaftarProduk daftarProduk = null;
            if (result.next()) {
                daftarProduk = new DaftarProduk();
                daftarProduk.setIdproduk(result.getInt("ID_PRODUK"));
                daftarProduk.setKategori(result.getString("KATEGORI_PRODUK"));
                daftarProduk.setMerk(result.getString("MERK_PRODUK"));
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));
            } else {
                throw new DaftarProdukException("Produk dengan Nama "
                        + nama_produk + " tidak ditemukan");
            }
            connection.commit();
            return daftarProduk;

        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw new DaftarProdukException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException exception) {
                }
            }
        }
    }

    @Override
    public List<DaftarProduk> selectCariProduk(String nama) throws DaftarProdukException {
        Statement statement = null;
    List<DaftarProduk> list = new ArrayList<DaftarProduk>();
        try {
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            
            ResultSet result = statement.executeQuery("SELECT * FROM DAFTARPRODUK WHERE NAMA_PRODUK LIKE '%"+nama+"%'");
            DaftarProduk daftarProduk = null;
            while (result.next()) {
                daftarProduk = new DaftarProduk();
                daftarProduk.setNamaproduk(result.getString("NAMA_PRODUK"));
                daftarProduk.setSpesifikasi(result.getString("SPESIFIKASI"));
                daftarProduk.setHarga(result.getString("HARGA"));
                
                list.add(daftarProduk);
            }
            connection.commit();
            return list;
            
        } catch (SQLException e) {
            try {
                connection.rollback();
            } catch (SQLException ex) {
            }
            throw  new DaftarProdukException(e.getMessage());
        } finally {
            try {
                connection.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            if (statement!=null) {
                try {
                statement.close();
            } catch (SQLException e) {
            }
            }
        }
    }
  


}
