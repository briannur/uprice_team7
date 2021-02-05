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
public class capcay implements makanan{
    
    @Override
    public String getDeskripsi() {
        return "Capcay";
    }
    
    @Override
    public int harga() {
        return 12000;
    }
}
