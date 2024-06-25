package B_ChainOfResponsibility;

public abstract class Logger {

    /* Chain of Responsibility */
    public final Logger nextLogger;

    public Logger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void log(LoggerRequest req);
}
