public class Jacks extends GameMode implements Delete{
    private int p1Pos;
    private int p2Pos;
    private int p3Pos;
    private int p4Pos;

    public void decrement(int p1Pos, int p2Pos, int p3Pos, int p4Pos) {

            this.p1Pos = p1Pos;
            this.p2Pos = p2Pos;
            this.p3Pos = p3Pos;
            this.p4Pos = p4Pos;

            this.p1Score = calculateScore(p1Pos) ;
            this.p2Score = calculateScore(p2Pos);
            this.p3Score = calculateScore(p3Pos);
            this.p4Score = calculateScore(p4Pos);
        }
    public int calculateScore(int x) {
        switch (x) {
            case 1:
                return 200;
            case 2:
                return 150;
            case 3:
                return 100;
            case 4:
                return 50;
            default:
                return 0;
        }
    }
    public int deleteScore(int x) {
        switch (x) {
            case 1:
                return -200;
            case 2:
                return -150;
            case 3:
                return -100;
            case 4:
                return -50;
            default:
                return 0;
        }
    }

    @Override
    public void ResetScore() {
        this.p1Score = deleteScore(p1Pos) ;
        this.p2Score = deleteScore(p2Pos);
        this.p3Score = deleteScore(p3Pos);
        this.p4Score = deleteScore(p4Pos);
    }
}
