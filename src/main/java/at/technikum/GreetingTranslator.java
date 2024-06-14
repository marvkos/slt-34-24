package at.technikum;

import java.util.Locale;

public class GreetingTranslator {

    public String getGreeting(Locale locale) {
        if (Locale.ENGLISH == locale) {
            return "Hello";
        }

        if (Locale.GERMAN == locale) {
            return "Hallo";
        }

        throw new IllegalArgumentException(
                "Language is not supported"
        );
    }
}
