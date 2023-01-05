package org.itmo.lab4.printers;

import org.itmo.lab4.actions.SimpleAction;

import java.util.Objects;

public interface Printer {
    void print(String text);
    void printSimpleAction(Object subject, SimpleAction action);
}
