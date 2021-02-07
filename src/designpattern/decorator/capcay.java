/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.decorator;

/**
 *
 * @author Brian
 */
public class capcay extends makananDecorator {
    public capcay(makanan decoratedMakanan) {
        this.decoratedMakanan = decoratedMakanan;
    }
    
    @Override
    public String getDeskripsi() {
        return decoratedMakanan.getDeskripsi() + "Capcay";
    }
    
    @Override
    public int harga() {
        return decoratedMakanan.harga() + 12000;
    }
}