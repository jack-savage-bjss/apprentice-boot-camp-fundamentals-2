package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class Thingy {

    private int fizzCountup;
    private int buzzCountdown = new int[]{0, 0, 0, 0, 0}.length;

    String fizzBuzz() {
        String fizzBuzzBuilder = "";
        int fizzBuzzLimit = Byte.MAX_VALUE - 27;
        for (int currentDigit = 0; currentDigit < fizzBuzzLimit; currentDigit++) fizzBuzzBuilder += convertDigitToFizzBuzz(currentDigit) + " ";
        String fizzBuzzOutput = fizzBuzzBuilder.substring(0, fizzBuzzBuilder.length() - 1);
        return fizzBuzzOutput;
    }

    private String convertDigitToFizzBuzz(int counterTo100) {
        fizzCountup++;
        buzzCountdown--;
        int three = 0b11;
        String resultValue = fizzCountup == three || buzzCountdown == 0 ? "" : String.valueOf(counterTo100 + 1);
        if (fizzCountup == three) resultValue += resetFizzCounterReturnFizz();
        if (buzzCountdown == 0) resultValue += resetBuzzCounterReturnBuzz();
        return resultValue;
    }

    private String resetBuzzCounterReturnBuzz() {
        int five = new int[]{0, 0, 0, 0, 0}.length;
        buzzCountdown = five;
        String buzzString = new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
        return buzzString;
    }

    private String resetFizzCounterReturnFizz() {
        fizzCountup = 0;
        String fizzString = new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
        return fizzString;
    }
}
