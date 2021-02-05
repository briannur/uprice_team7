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
public abstract class makananDecorator implements makanan {
    protected makanan decoratedMakanan;
    
    @Override
    public String getDeskripsi() {
        return decoratedMakanan.getDeskripsi();
    }
    
    @Override
    public int harga() {
        return decoratedMakanan.harga();
    }
}
