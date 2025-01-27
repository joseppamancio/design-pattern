package com.joseppamancio.factory_method._4_creation;

import com.joseppamancio.factory_method._1_interface.LogPrinter;
import com.joseppamancio.factory_method._2_implementation.ConsoleLogPrinter;
import com.joseppamancio.factory_method._3_abstraction.Logger;

public class ConsoleLogCreator extends Logger {
    @Override
    protected LogPrinter createLogger() {
        return new ConsoleLogPrinter();
    }
}