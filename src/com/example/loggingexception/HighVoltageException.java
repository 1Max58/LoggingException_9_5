package com.example.loggingexception;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class HighVoltageException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");
    public HighVoltageException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
    @Override
    public String toString() {
        return "Voltage is too high";
    }
}
