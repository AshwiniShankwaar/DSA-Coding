package javaRevision.Localization;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatExample {
    public static void main(String[] args) {
        String message = "{0} has {1} message from {2} girlfriends";

        String messageFormatter = MessageFormat.format(message,"Ashwini",10,2);
        System.out.println(messageFormatter);

        Locale locale = Locale.JAPANESE;
        ResourceBundle bundle = ResourceBundle.getBundle("message",locale);

        String localizedMessage = bundle.getString("test");
        String formattedMessage = MessageFormat.format(localizedMessage,"Ashwini",10,2);
        System.out.println(formattedMessage);


    }

}
