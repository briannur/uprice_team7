/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern.command;

/**
 *
 * @author Brian
 */
public class printerCommand implements Command {
    printer out;
    
    public printerCommand(printer out) {
        this.out = out;
    }

    @Override
    public void execute() {
        out.print();
    }
    
}
