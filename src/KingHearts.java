public class KingHearts extends GameMode {
    public void kingDoubled(Player doubler, Player losing){
        if(doubler.getId() == 1){
        this.p1Score = 75;

        }
        if(doubler.getId()==2){
        this.p2Score = 75;
        }
        if(doubler.getId()==3){
        this.p3Score = 75;
        }
        if(doubler.getId()==4){
        this.p4Score = 75;
        }
        if(losing.getId() == 1){
            this.p1Score = -150;
        }
        if(losing.getId()==2){
            this.p2Score = -150;
        }
        if(losing.getId()==3){
            this.p3Score = -150;
        }
        if(losing.getId()==4){
            this.p4Score = -150;
        }

    }
    public void notDoubled(Player taker){
        if(taker.getId()==1)
            this.p1Score = -75;
        if(taker.getId()==2)
            this.p2Score = -75;
        if(taker.getId()==3)
            this.p3Score = -75;
        if(taker.getId()==4)
            this.p4Score = -75;
    }

    public void deleteDoubled(Player doubler, Player losing) {
        if(doubler.getId() == 1){
            this.p1Score = -75;
        }
        if(doubler.getId()==2){
            this.p2Score = -75;
        }
        if(doubler.getId()==3){
            this.p3Score = -75;
        }
        if(doubler.getId()==4){
            this.p4Score = -75;
        }
        if(losing.getId() == 1){
            this.p1Score = 150;
        }
        if(losing.getId()==2){
            this.p2Score = 150;
        }
        if(losing.getId()==3){
            this.p3Score = 150;
        }
        if(losing.getId()==4){
            this.p4Score = 150;
        }
    }
    void deleteNotDoubled(Player taker){
        if(taker.getId()==1)
            this.p1Score = 75;
        if(taker.getId()==2)
            this.p2Score = 75;
        if(taker.getId()==3)
            this.p3Score = 75;
        if(taker.getId()==4)
            this.p4Score = 75;
    }
}
