package io.github.dbc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class TestAlphabetChecker {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private AlphabetChecker alphabetChecker;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        alphabetChecker = new AlphabetChecker();
    }

    @Test
    void shouldHaveCorrectMethodName() {
        try {
            AlphabetChecker.class.getMethod("printVowelOrConsonant", char.class);
            Assertions.assertEquals("printVowelOrConsonant", alphabetChecker.getClass().getMethod("printVowelOrConsonant", char.class).getName(), "The method name should be 'printVowelOrConsonant'");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method printVowelOrConsonant() not found");
        }
    }

    @Test
    void shouldHaveCorrectNumberOfParameters() {
        try {
            AlphabetChecker.class.getMethod("printVowelOrConsonant", char.class);
            Assertions.assertEquals(1, alphabetChecker.getClass().getMethod("printVowelOrConsonant", char.class).getParameterCount(), "The method should have 1 parameter");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method printVowelOrConsonant() not found");
        }
    }

    @Test
    void shouldHaveCorrectTypeOfParameter() {
        try {
            AlphabetChecker.class.getMethod("printVowelOrConsonant", char.class);
            Assertions.assertEquals(char.class, alphabetChecker.getClass().getMethod("printVowelOrConsonant", char.class).getParameterTypes()[0], "The method should have a parameter of type char");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method printVowelOrConsonant() not found");
        }
    }

    @Test
    void shouldHaveVoidReturnType() {
        try {
            AlphabetChecker.class.getMethod("printVowelOrConsonant", char.class);
            Assertions.assertEquals(void.class, alphabetChecker.getClass().getMethod("printVowelOrConsonant", char.class).getReturnType(), "The method should have a return type of void");
        } catch (NoSuchMethodException e) {
            Assertions.fail("Method printVowelOrConsonant() not found");
        }
    }

    // TODO: remove the @Disabled annotation when you have implemented the method and uncomment the line below
    @Disabled("This test is disabled because it is not implemented yet")
    @ParameterizedTest(name = "printVowelOrConsonant() should print \"vowel\" for vowel {0}")
    @ValueSource(chars = {'a', 'e', 'i', 'o', 'u'})
    void shouldPrintVowel(char vowel) {
//        alphabetChecker.printVowelOrConsonant(vowel);
        Assertions.assertEquals("vowel", outputStreamCaptor.toString().trim());
    }

    // TODO: remove the @Disabled annotation when you have implemented the method and uncomment the line below
    @Disabled("This test is disabled because it is not implemented yet")
    @ParameterizedTest(name = "printVowelOrConsonant() should print \"consonant\" for consonant {0}")
    @ValueSource(chars = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'})
    void shouldPrintConsonant(char consonant) {
//        alphabetChecker.printVowelOrConsonant(consonant);
        Assertions.assertEquals("consonant", outputStreamCaptor.toString().trim());
    }

    // TODO: remove the @Disabled annotation when you have implemented the method and uncomment the line below
    @Disabled("This test is disabled because it is not implemented yet")
    @ParameterizedTest(name = "printVowelOrConsonant() should print \"invalid\" for invalid {0}")
    @ValueSource(chars = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '{', '}', '[', ']', '|', '\\', ':', ';', '\'', '\"', '<', '>', '?', '.', ','})
    void shouldPrintInvalid(char invalidCharacter) {
//        alphabetChecker.printVowelOrConsonant(invalidCharacter);
        Assertions.assertEquals("invalid", outputStreamCaptor.toString().trim());
    }
}