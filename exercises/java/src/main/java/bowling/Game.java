package bowling;

public class Game {
    public Integer score(int[] rolls) {
        Integer totalScore = 0;

        if(rolls[0]+rolls[1] == 10) {
            totalScore += 1;
        }

        for(int roll : rolls) {
            totalScore += roll;
        }
        return totalScore;
    }
}
