public class TennisGame {

    int playerOneScore = 0;
    int playerOnePoints = 0;
    int playerTwoScore = 0;
    int playerTwoPoints = 0;


    public void wonPoint(String winner) {
        if (winner == "player 1") {
            playerOnePoints++;
        } else if (winner == "player 2") {
            playerTwoPoints++;
        }

    }

    public String getScore() {
        if (playerOnePoints == 1) {
            playerOneScore =  15;
        } else if (playerOnePoints == 2) {
            playerOneScore = 30;
        } else if (playerOnePoints == 3) {
            playerOneScore = 40;
        }
        if (playerTwoPoints == 1) {
            playerTwoScore = 15;
        } else if (playerTwoPoints == 2) {
            playerTwoScore = 30;
        } else if (playerTwoPoints == 3) {
            playerTwoScore = 40;
        }
        return playerOneScore + "-" + playerTwoScore;
    }
}
