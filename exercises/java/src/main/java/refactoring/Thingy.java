package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class Thingy {

    private int counterTo100;
    private int fizzCounter;
    private int buzzCounter = new int[]{0, 0, 0, 0, 0}.length; //5

    String fizzBuzz() {
        String output = "";
        for (; counterTo100 < Byte.MAX_VALUE - 27; counterTo100++) output += calculateFizzBuzzForDigit(counterTo100) + " ";
        return output.substring(0, output.length() - 1);
    }

    private String calculateFizzBuzzForDigit(int counterTo100) {
        fizzCounter++;
        buzzCounter--;
        String s = fizzCounter == 0b11 || buzzCounter == 0 ? "" : String.valueOf(counterTo100 + 1); // if bar == 3 or 5, s = number
        if (fizzCounter == 0b11) s += resetFizzCounterReturnFizz();
        if (buzzCounter == 0) s += resetBuzzCounterReturnBuzz();
        return s;
    }

    private String resetBuzzCounterReturnBuzz() {
        buzzCounter = new int[]{0, 0, 0, 0, 0}.length; // 5
        return new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    }

    private String resetFizzCounterReturnFizz() {
        fizzCounter = 0;
        return new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
    }
}
