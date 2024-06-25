package B_ChainOfResponsibility;

import B_ChainOfResponsibility.LoggerRequest.LoggerType;

public class ConsoleLogger extends Logger {

    public ConsoleLogger(Logger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LoggerRequest req) {
        if (req.getLoggerType() == LoggerType.CONSOLE) {
            System.out.println(req.getMessage());
        } else if (nextLogger != null) {
            nextLogger.log(req);
        }
    }

}
