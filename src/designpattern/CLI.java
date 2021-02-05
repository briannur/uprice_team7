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
import designpattern.decorator.nugget;
import designpattern.decorator.sosis;

import java.util.Scanner;

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

        // call dummyData
//        dummyData data = new dummyData();
//        String[][] menu = data.getMenu();
//        String[][] topping = data.getTopping();
        
        // print table daftar menu
        System.out.println("-------DAFTAR MENU-------");
        dummyData.menuList();
        
        Scanner in = new Scanner(System.in);
        System.out.print("your choice:");
        
        String choice = in.nextLine();
        if (null != choice) switch (choice) {
            case "001":{
                makanan Makanan = new nasigoreng();
                    break;
                }
            case "002":{
                makanan Makanan = new miegoreng();
                    break;
                }
            case "003":{
                makanan Makanan = new capcay();
                    break;
                }
            default:
                break;
        }
        
        // print table daftar topping
        System.out.println("-------DAFTAR TOPPING-------");
        dummyData.toppingList();
        
        System.out.print("your choice:");
        
        choice = in.nextLine();
        
    }
    
    public String clearScreen() {
        char esc = 27;
        return (esc + "[2J");
    }
}
