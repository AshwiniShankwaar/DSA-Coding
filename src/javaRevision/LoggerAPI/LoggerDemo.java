package javaRevision.LoggerAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.logging.*;

public class LoggerDemo {
    public static void main(String[] args) {
        //Logger logger = Logger.getAnonymousLogger();
        //Logger logger = Logger.getAnonymousLogger("resourceBundle");
        //Logger logger = Logger.getLogger("APPLOGGER");
        //Logger logger = Logger.getLogger("APPLOGGER","resource");
        Logger logger = Logger.getGlobal();

        //LoggerHandler
//        Handler handler = new ConsoleHandler();
        File infputFile = new File(Paths.get("").toAbsolutePath().toString(),"/loggerDemo.log");
        FileHandler fileHandler;
        //Handler handler;
        try {
            fileHandler = new FileHandler(infputFile.getAbsolutePath(),true);
//            handler = new SocketHandler("localhost",12345);
//            handler = new StreamHandler();
           // handler = new MemoryHandler();//not recommended
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //formater for logging
  //      Formatter formater = new XMLFormatter();//default
//        Formatter formater = new SimpleFormatter();
        Formatter formatter = new CustomeFormatter();

        fileHandler.setFormatter(formatter);
        logger.addHandler(fileHandler);


        //creating filter
        Filter filter = new CustomeLogFilter();
        logger.setFilter(filter);

//        logger.info("info");
//        logger.config("config");
//        logger.warning("warning");
//        logger.fine("fine");
//        logger.finer("finer");
//        logger.finest("finest");

        logger.log(Level.INFO,"info");
        logger.log(Level.CONFIG,"config");
        logger.log(Level.WARNING,"warning");
        logger.log(Level.FINE,"fine");
        logger.log(Level.FINER,"finer");
        logger.log(Level.FINEST,"finest");
    }
}
