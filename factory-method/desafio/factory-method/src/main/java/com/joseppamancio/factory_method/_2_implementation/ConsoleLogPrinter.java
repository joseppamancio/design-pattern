package com.joseppamancio.factory_method._2_implementation;

import com.joseppamancio.factory_method._1_interface.LogPrinter;

public class ConsoleLogPrinter implements LogPrinter {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}