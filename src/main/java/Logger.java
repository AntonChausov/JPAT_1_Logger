import java.util.Date;

public class Logger {
    protected static int num = 1;
    private static Logger instance;

    public void log(String msg) {
        System.out.println("[" + new Date().toString() + " " + num++ + "] " + msg);
    }

    private Logger() {}

    public static Logger getInstance() {
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
}
