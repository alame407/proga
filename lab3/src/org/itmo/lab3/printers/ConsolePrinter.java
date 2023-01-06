package org.itmo.lab3.printers;

import org.itmo.lab3.actions.SimpleAction;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
