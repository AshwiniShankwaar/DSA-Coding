package javaRevision.LoggerAPI;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class CustomeLogFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        return record.getLevel() == Level.WARNING;
    }
}
