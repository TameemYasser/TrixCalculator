public class Player {
String name;
    private int id;
    private int roundScore;
    private int oldScore;
    private int totalScore = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Player(String name, int id) {
        this.name = name;
        this.id = id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoundScore() {
        return roundScore;
    }

    public void setRoundScore(int roundScore) {
        this.roundScore = roundScore;
    }

    public int getOldScore() {
        return oldScore;
    }

    public void setOldScore() {
        this.oldScore = this.oldScore + this.roundScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore() {
        //this.totalScore = totalScore;
        this.totalScore = this.totalScore + this.roundScore;
    }
}
