package B_ChainOfResponsibility;

import B_ChainOfResponsibility.LoggerRequest.LoggerType;

public class FileLogger extends Logger {

    public FileLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest req) {
        if (req.getLoggerType() == LoggerType.FILE) {
            System.out.println("Writing in progress... " + req.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(req);
        }
    }

}
