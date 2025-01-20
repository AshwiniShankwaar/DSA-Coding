package javaRevision.LoggerAPI;

import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomeFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        Date df = new Date(record.getMillis());
        sb.append(df);
        sb.append(" |level: ");
        sb.append(record.getLevel());
        sb.append(" |Class name: ");
        sb.append(record.getSourceClassName());
        sb.append(" |Method name: ");
        sb.append(record.getSourceMethodName());
        Throwable throwable = record.getThrown();
        if(throwable!=null){
            sb.append(" |Throwable: ");
            sb.append(throwable.getClass().getName());
            StackTraceElement element[] = throwable.getStackTrace();
            sb.append(" |Line: ");
            sb.append(element[0].getLineNumber());
        }
        sb.append(" |Message: ");
        sb.append(record.getMessage());
        sb.append("\n");

        return sb.toString();
    }
}
