/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.assets;

import static java.lang.System.out;
/**
 *
 * @author Brian
 */
public class dummyData {
        
    private final String[][] menu = {
        {"001", "Nasi Goreng", "Rp. 10000"},
        {"002", "Mie Goreng", "Rp. 8000"},
        {"003", "Capcay", "Rp. 12000"}
    };
    
    public String[][] getMenu() {
        return menu.clone();
    }
    
    public static void menuList() {
        final PrettyPrinter printer = new PrettyPrinter(out);
        printer.print(new String[][] {
        new String[] {"ID", "MENU", "PRICE"},
        new String[] {" 001 ", " Nasi Goreng ", " Rp. 10000 "},
        new String[] {" 002 ", " Mie Goreng ", " Rp. 8000 "},
        new String[] {" 003 ", " Capcay ", " Rp. 12000 "},
        });
    }
    
    private final String[][] topping = {
        {"T01", "Telor Ceplok", "Rp. 4000"},
        {"T02", "Telor Dadar", "Rp. 4000"},
        {"T03", "Nugget", "Rp. 7000"},
        {"T04", "Sosis", "Rp. 7000"}
    };
    
    public String[][] getTopping() {
        return topping.clone();
    }
    
    public static void toppingList() {
        final PrettyPrinter printer = new PrettyPrinter(out);
        printer.print(new String[][] {
        new String[] {"ID", "MENU", "PRICE"},
        new String[] {" T01 ", " Telor Ceplok ", " Rp. 4000 "},
        new String[] {" T02 ", " Telor Dadar ", " Rp. 4000 "},
        new String[] {" T03 ", " Nugget ", " Rp. 7000 "},
        new String[] {" T04 ", " Sosis ", " Rp. 7000 "},
        });
    }
}
