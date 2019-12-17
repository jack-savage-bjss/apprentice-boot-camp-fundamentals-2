package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzBuzzCreator {

    public static final int FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final int FIVE = new int[]{0, 0, 0, 0, 0}.length;
    public static final String BUZZ_TEXT = hexToString("42757a7a");
    public static final String FIZZ_TEXT = hexToString("46697a7a");

    private int fizzCountup;
    private int buzzCountdown = FIVE;

    String fizzBuzz() {
        String fizzBuzzBuilder = "";
        for (int currentDigit = 0; currentDigit < FIZZ_BUZZ_LIMIT; currentDigit++)
            fizzBuzzBuilder += convertDigitToFizzBuzz(currentDigit) + " ";
        return removeLastCharacter(fizzBuzzBuilder);
    }

    private String removeLastCharacter(String input) {
        return input.substring(0, input.length() - 1);
    }

    private String convertDigitToFizzBuzz(int digit) {
        fizzCountup++;
        buzzCountdown--;

        String resultValue = isValueThree(fizzCountup) || isValueZero(buzzCountdown) ? "" : indexToNumericalValueAsString(digit);

        if (isValueThree(fizzCountup)) resultValue += resetFizzCounterReturnFizz();
        if (isValueZero(buzzCountdown)) resultValue += resetBuzzCounterReturnBuzz();

        return resultValue;
    }

    private boolean isValueZero(int value) {
        return value == 0;
    }

    private boolean isValueThree(int value) {
        return value == THREE;
    }

    private String indexToNumericalValueAsString(int counterTo100) {
        return String.valueOf(counterTo100 + 1);
    }

    private String resetBuzzCounterReturnBuzz() {
        buzzCountdown = FIVE;
        return BUZZ_TEXT;
    }

    private String resetFizzCounterReturnFizz() {
        fizzCountup = 0;
        return FIZZ_TEXT;
    }

    private static String hexToString(String hex) {
        return new String(DatatypeConverter.parseHexBinary(hex), StandardCharsets.UTF_8);
    }
}
