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
public class cashierMachineCommand implements Command {
    cashierMachine cash;
    
    public cashierMachineCommand(cashierMachine cash) {
        this.cash = cash;
    }

    @Override
    public void execute() {
        cash.open();
    }
}
