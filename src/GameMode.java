public class GameMode {
    //Save  player's score in this round
    protected int p1Score;
    protected int p2Score;
    protected int p3Score;
    protected int p4Score;

    public void setPlayerScore(Player p1, Player p2, Player p3, Player p4) {
        p1.setRoundScore(this.p1Score);
        p1.setTotalScore();
        p2.setRoundScore(this.p2Score);
        p2.setTotalScore();
        p3.setRoundScore(this.p3Score);
        p3.setTotalScore();
        p4.setRoundScore(this.p4Score);
        p4.setTotalScore();
    }

    public int getP1Score() {
        return p1Score;
    }

    public int getP2Score() {
        return p2Score;
    }

    public int getP3Score() {
        return p3Score;
    }

    public int getP4Score() {
        return p4Score;
    }
}
