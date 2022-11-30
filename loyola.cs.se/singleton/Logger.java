public class Logger {
    private Logger(){
    }

    private static Logger instance = null;

    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }

    public void write(String s){
        //...
    }
    protected void open(){

    }

    
}
