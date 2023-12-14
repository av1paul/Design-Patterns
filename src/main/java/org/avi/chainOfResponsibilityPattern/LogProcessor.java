package org.avi.chainOfResponsibilityPattern;

public abstract class LogProcessor {

    public static final int INFO = 1, DEBUG = 2, ERROR = 3;

    private LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message) {
        if(nextLogProcessor != null) {
            nextLogProcessor.log(logLevel, message);
        }
    }
}
