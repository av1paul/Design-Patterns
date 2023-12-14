package org.avi.chainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO, "Info");
        logProcessor.log(LogProcessor.DEBUG, "Debug");
        logProcessor.log(LogProcessor.ERROR, "Error");
    }
}
