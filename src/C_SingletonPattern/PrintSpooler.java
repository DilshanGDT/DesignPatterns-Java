package C_SingletonPattern;

public final class PrintSpooler { /* final - class canont be extended */

    private PrintSpooler() {
    }

    /* Singleton without threadsafty - use ENUM to make this threadsafe */
    private static PrintSpooler INSTANCE;

    public static PrintSpooler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }

    void print() {
        System.out.println("Printing...");
    }
}
