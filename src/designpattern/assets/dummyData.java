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
        new String[] {"CODE", "MENU", "PRICE"},
        new String[] {" 1 ", " Nasi Goreng ", " Rp. 10000 "},
        new String[] {" 2 ", " Mie Goreng ", " Rp. 8000 "},
        new String[] {" 3 ", " Capcay ", " Rp. 12000 "},
        });
    }
    
    private final String[][] topping = {
        {"T01", "Telor Ceplok", "Rp. 3000"},
        {"T02", "Telor Dadar", "Rp. 3000"},
        {"T03", "Nugget", "Rp. 7000"},
        {"T04", "Sosis", "Rp. 7000"}
    };
    
    public String[][] getTopping() {
        return topping.clone();
    }
    
    public static void toppingList() {
        final PrettyPrinter printer = new PrettyPrinter(out);
        printer.print(new String[][] {
        new String[] {"CODE", "MENU", "PRICE"},
        new String[] {" 1 ", " Telor Ceplok ", " Rp. 3000 "},
        new String[] {" 2 ", " Telor Dadar ", " Rp. 3000 "},
        new String[] {" 3 ", " Nugget ", " Rp. 7000 "},
        new String[] {" 4 ", " Sosis ", " Rp. 7000 "},
        });
    }
}
