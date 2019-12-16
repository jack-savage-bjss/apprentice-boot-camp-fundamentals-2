package bowling;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BowlingTest {

    @Test
    public void scoresAllZeros() {
        Game game = new Game();

        int[] rolls = { 0,0, 0,0, 0,0, 0,0, 0,0,
                        0,0, 0,0, 0,0, 0,0, 0,0 };

        assertThat(game.score(rolls)).isEqualTo(0);
    }

    @Test
    public void scores20WhenEachRollIs1() {
        Game game = new Game();

        int[] rolls = { 1,1, 1,1, 1,1, 1,1, 1,1,
                        1,1, 1,1, 1,1, 1,1, 1,1 };

        assertThat(game.score(rolls)).isEqualTo(20);
    }

    @Test
    public void spareInFirstFrameAddsCorrectBonus() {
        Game game = new Game();

        int[] rolls = { 3,7, 1,1, 1,1, 1,1, 1,1,
                        1,1, 1,1, 1,1, 1,1, 1,1 };

        assertThat(game.score(rolls)).isEqualTo(29);
    }
    
}
