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
public class emptyplate implements makanan {
    
    @Override
    public String getDeskripsi() {
        return "";
    }
    
    @Override
    public int harga() {
        return 0;
    }
}
