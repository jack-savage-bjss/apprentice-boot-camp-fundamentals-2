package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class FizzBuzzCreator {

    public static final int FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final int FIVE = new int[]{0, 0, 0, 0, 0}.length;
    public static final String BUZZ_TEXT = new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    public static final String FIZZ_TEXT = new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);

    private int fizzCountup;
    private int buzzCountdown = FIVE;

    String fizzBuzz() {
        String fizzBuzzBuilder = "";
        int fizzBuzzLimit = FIZZ_BUZZ_LIMIT;
        for (int currentDigit = 0; currentDigit < fizzBuzzLimit; currentDigit++) fizzBuzzBuilder += convertDigitToFizzBuzz(currentDigit) + " ";
        String fizzBuzzOutput = fizzBuzzBuilder.substring(0, fizzBuzzBuilder.length() - 1);
        return fizzBuzzOutput;
    }

    private String convertDigitToFizzBuzz(int counterTo100) {
        fizzCountup++;
        buzzCountdown--;
        int three = THREE;
        String numericalValue = String.valueOf(counterTo100 + 1);
        String resultValue = fizzCountup == three || buzzCountdown == 0 ? "" : numericalValue;
        boolean isDivisibleByThree = fizzCountup == three;
        boolean isDivisibleByFive = buzzCountdown == 0;
        if (isDivisibleByThree) resultValue += resetFizzCounterReturnFizz();
        if (isDivisibleByFive) resultValue += resetBuzzCounterReturnBuzz();
        return resultValue;
    }

    private String resetBuzzCounterReturnBuzz() {
        int five = FIVE;
        buzzCountdown = five;
        String buzzText = BUZZ_TEXT;
        return buzzText;
    }

    private String resetFizzCounterReturnFizz() {
        fizzCountup = 0;
        String fizzText = FIZZ_TEXT;
        return fizzText;
    }
}
