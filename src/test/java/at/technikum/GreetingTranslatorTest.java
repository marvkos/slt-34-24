package at.technikum;

import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTranslatorTest {

    @Test
    void when_localeEnglish_then_greetingHello() {
        // Arrange
        GreetingTranslator greetingTranslator = new GreetingTranslator();
        Locale locale = Locale.ENGLISH;

        // Act
        String greeting = greetingTranslator
                .getGreeting(locale);

        // Assert
        assertEquals("Hello", greeting);
    }

    @Test
    void when_localeGerman_then_greetingHallo() {
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        assertEquals(
                "Hallo",
                greetingTranslator.getGreeting(Locale.GERMAN)
        );
    }

    @Test
    void when_unsupportedLocale_then_illegalArgumentException() {
        GreetingTranslator greetingTranslator = new GreetingTranslator();

        assertThrows(
                IllegalArgumentException.class,
                () -> greetingTranslator.getGreeting(Locale.FRENCH)
        );
    }
}