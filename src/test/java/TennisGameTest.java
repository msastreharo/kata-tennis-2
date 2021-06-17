import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TennisGameTest {

    @Test
    void playerOneScores() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 1");

        assertThat(tennisGame.getScore(), equalTo("15-0"));
    }

    @Test
    void playerTwoScores() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 2");

        assertThat(tennisGame.getScore(), equalTo("0-15"));
    }

    @Test
    void bothPlayersScore() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 1");
        tennisGame.wonPoint("player 2");

        assertThat(tennisGame.getScore(), equalTo("15-15"));
    }

    @Test
    void playerOneScoresASecondTime() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 1");
        tennisGame.wonPoint("player 1");

        assertThat(tennisGame.getScore(), equalTo("30-0"));
    }

    @Test
    void playerTwoScoresASecondTime() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 2");
        tennisGame.wonPoint("player 2");

        assertThat(tennisGame.getScore(), equalTo("0-30"));
    }

    @Test
    void playerOneScoresAThirdTime() {
        TennisGame tennisGame = new TennisGame();

        tennisGame.wonPoint("player 1");
        tennisGame.wonPoint("player 1");
        tennisGame.wonPoint("player 1");

        assertThat(tennisGame.getScore(), equalTo("40-0"));
    }
}
