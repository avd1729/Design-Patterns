package singleton;

public class Logger {

    private volatile static Logger logger;

    private Logger(){}

    static Logger getInstance(){
        if(logger == null){
            synchronized(Logger.class){
                if(logger == null){
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
