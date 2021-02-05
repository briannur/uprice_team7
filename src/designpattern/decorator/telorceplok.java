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
public class telorceplok extends makananDecorator {
    public telorceplok(makanan decoratedMakanan) {
        this.decoratedMakanan = decoratedMakanan;
    }
    
    @Override
    public String getDeskripsi() {
        return decoratedMakanan.getDeskripsi() + ", telor ceplok";
    }
    
    @Override
    public int harga() {
        return decoratedMakanan.harga() + 3000;
    }
}
