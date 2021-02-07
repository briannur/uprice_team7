/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import designpattern.assets.dummyData;
import designpattern.command.SimpleRemoteControl;
import designpattern.command.cashierMachine;
import designpattern.command.cashierMachineCommand;
import designpattern.command.printer;
import designpattern.command.printerCommand;
import designpattern.decorator.nasigoreng;
import designpattern.decorator.telordadar;
import designpattern.decorator.miegoreng;
import designpattern.decorator.telorceplok;
import designpattern.decorator.makanan;
import designpattern.decorator.capcay;
import designpattern.decorator.emptyplate;
import designpattern.decorator.nugget;
import designpattern.decorator.sosis;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Brian
 */
public class CLI {
    
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
        
        // new object makanan buat makanan :U
        makanan Makanan = new emptyplate();

        // call dummyData
        /*
        dummyData data = new dummyData();
        String[][] menu = data.getMenu();
        String[][] topping = data.getTopping();
        */
        
        // print table daftar menu
        System.out.println("-------DAFTAR MENU-------");
        dummyData.menuList();
        
        // new object in buat scanner
        Scanner in = new Scanner(System.in);
        
        // mintak input user
        System.out.print("your choice: ");
        String choice = in.nextLine();
        
        // perulangan untuk memproses inputan user
        if (null != choice) switch (choice) {
            case "1":{
                  Makanan = new nasigoreng(Makanan);
                    break;
                }
            case "2":{
                Makanan = new miegoreng(Makanan);
                    break;
                }
            case "3":{
                Makanan = new capcay(Makanan);
                    break;
                }
            default:
                JOptionPane.showMessageDialog(new JFrame(), "What?", "Dude..?", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        // print table daftar topping
        System.out.println("-------DAFTAR TOPPING-------");
        dummyData.toppingList();
        
        // mintak input user lagi
        System.out.print("your choice: ");
        choice = in.nextLine();
        
        String[] arrOfStr = null;
        
        if (null != choice) {
            arrOfStr = choice.split("");
        }
        
        // perulangan untuk memproses inputan user
        for (String a : arrOfStr) {
            switch (a) {
                case "1":{
                      Makanan = new telorceplok(Makanan);
                        break;
                    }
                case "2":{
                    Makanan = new telordadar(Makanan);
                        break;
                    }
                case "3":{
                    Makanan = new nugget(Makanan);
                        break;
                    }
                case "4":{
                    Makanan = new sosis(Makanan);
                        break;
                    }
                default:
                    break;
            }
        }
        
        System.out.println(Makanan.getDeskripsi() + " - Rp." + Makanan.harga() + "\n");
    }
}