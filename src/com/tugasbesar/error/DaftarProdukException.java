/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasbesar.error;

/**
 *
 * @author Ajayfaul
 */
public class DaftarProdukException extends Exception {

    /**
     * Creates a new instance of <code>DaftarProdukException</code> without
     * detail message.
     */
    public DaftarProdukException() {
    }

    /**
     * Constructs an instance of <code>DaftarProdukException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public DaftarProdukException(String msg) {
        super(msg);
    }
}
