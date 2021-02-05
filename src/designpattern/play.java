/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.command.cashierMachine;
import designpattern.command.printerCommand;
import designpattern.command.cashierMachineCommand;
import designpattern.command.printer;
import designpattern.command.SimpleRemoteControl;
import designpattern.decorator.nasigoreng;
import designpattern.decorator.telordadar;
import designpattern.decorator.miegoreng;
import designpattern.decorator.telorceplok;
import designpattern.decorator.makanan;
import designpattern.decorator.capcay;
import designpattern.decorator.nugget;
import designpattern.decorator.sosis;

/**
 *
 * @author Brian
 */
public class play {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // invoker
        SimpleRemoteControl remote  = new SimpleRemoteControl();
        
        // reciever
        cashierMachine cashier = new cashierMachine();
        printer print = new printer();
        
        // command
        cashierMachineCommand openTray = new cashierMachineCommand(cashier);
        printerCommand printout = new printerCommand(print);
        
        // order food (decorator)
        System.out.print("Sing tuku : Capcay 1 porsi ya bang...\nSistem : ");
        makanan Makanan = new capcay(); // makanannya di deklarasikan di mari, dengan memanggil nama class nya
        System.out.println(Makanan.getDeskripsi() + " Rp." + Makanan.harga() + "\n");
        
        System.out.print("Sing tuku : Nasgor 1 porsi tambah ceplok ya bang...\nSistem : ");
        makanan Makanan2 = new nasigoreng();
        Makanan2 = new telorceplok(Makanan2);   // decorator menambah topping pada variabel Makanan2
        System.out.println(Makanan2.getDeskripsi() + " Rp." + Makanan2.harga() + "\n");
        
        System.out.print("Sing tuku : nasgore tambah nugget juga bang...\nSistem : ");
        Makanan2 = new nugget(Makanan2);    // decorator menambah topping lagi pada variabel Makanan2
        System.out.println(Makanan2.getDeskripsi() + " Rp." + Makanan2.harga() + "\n");
        
        System.out.print("Sing tuku : Mie goreng seporsi pake dadar karo sosis ya bang...\nSistem : ");
        makanan Makanan3 = new miegoreng();
        // decorator menambah 3 topping ( 1 telor dadar dan 2 sosis ) pada variabel Makanan3
        Makanan3 = new telordadar(Makanan3);
        Makanan3 = new sosis(Makanan3);
        Makanan3 = new sosis(Makanan3);
        System.out.println(Makanan3.getDeskripsi() + " Rp." + Makanan3.harga() + "\n");
        
        /* ini decorator beneran di implementasiin begini apa begimana? wk
           kok ku rasa kudunya dibuat di ui nya ya, dibuat pake decorator..
           di atas lebih masuk ke analogi-nya, tapi kalo implementasi lebih cocok ke fungsionalitas ui nya
           welp..
           coba buka referensi ini: https://dicodein.blogspot.com/2017/10/pengertian-dan-contoh-pembuatan-java_12.html
           tapi di erd juga dah jadi gitu yak wk
           ...
           ¯\_(ツ)_/¯ */ 
        
        // remote
        remote.setCommand(openTray);    // membuka baki duid mesin kasir
        remote.trigger();               // eksekusi command
        remote.setCommand(printout);    // mencetak struk pembelian
        remote.trigger();               // eksekusi command
    }
    
}
