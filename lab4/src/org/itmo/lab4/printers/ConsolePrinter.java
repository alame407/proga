package org.itmo.lab4.printers;

import org.itmo.lab4.actions.SimpleAction;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
