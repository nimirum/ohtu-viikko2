package ohtu;

public class TennisGame {

    private int playerOneScore = 0;
    private int playerTwoScore = 0;
    private final String playerOne;
    private final String playerTwo;

    public TennisGame(String player1Name, String player2Name) {
        this.playerOne = player1Name;
        this.playerTwo = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerOne.equals(playerName)) {
            playerOneScore += 1;
        } else {
            playerTwoScore += 1;
        }
    }

    public String getScore() {
        String score = "";
        if (playerOneScore == playerTwoScore) {
            score = printScoreWhenEven(playerOneScore);
        } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
            score = printScoreWhenAdventageOrWin();
        } else {
            score += getScoreAsString(playerOneScore);
            score += "-";
            score += getScoreAsString(playerTwoScore);
        }
        return score;
    }

    private String printScoreWhenEven(int playerOneScore) {
        String score = "";
        switch (playerOneScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    private String printScoreWhenAdventageOrWin() {
        String score;
        int minusResult = playerOneScore - playerTwoScore;
        if (minusResult == 1) {
            score = "Advantage " + playerOne;
        } else if (minusResult == -1) {
            score = "Advantage " + playerTwo;
        } else if (minusResult >= 2) {
            score = "Win for " + playerOne;
        } else {
            score = "Win for " + playerTwo;
        }
        return score;
    }

    private String getScoreAsString(int tempscore) {
        String score = "";
        switch (tempscore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }
}
