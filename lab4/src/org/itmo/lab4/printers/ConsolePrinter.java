package org.itmo.lab4.printers;

import org.itmo.lab3.actions.SimpleAction;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text);
    }

    @Override
    public void printSimpleAction(Object subject, SimpleAction action) {
        this.print(subject + " " + action);
    }
}
