package com.joseppamancio.factory_method._3_abstraction;

import com.joseppamancio.factory_method._1_interface.LogPrinter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Logger {
    public void log(String message) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LogPrinter printer = createLogger();
        printer.print("[" + timestamp + "] " + message);
    }

    protected abstract LogPrinter createLogger();
}