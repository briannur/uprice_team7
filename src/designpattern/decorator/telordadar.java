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
public class telordadar extends makananDecorator {
    public telordadar(makanan decoratedMakanan) {
        this.decoratedMakanan = decoratedMakanan;
    }
    
    @Override
    public String getDeskripsi() {
        return decoratedMakanan.getDeskripsi() + ", telor dadar";
    }
    
    @Override
    public int harga() {
        return decoratedMakanan.harga() + 3000;
    }
}
