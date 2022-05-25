public class Queens extends GameMode{
//Each Round will have 4 Queens (Spades, Hearts, Diamonds, Trifles)
    public void Queen1Doubled(Player doubler, Player losing){
        if(doubler.getId() == 1){
            this.p1Score = 25;

        }
        if(doubler.getId()==2){
            this.p2Score = 25;
        }
        if(doubler.getId()==3){
            this.p3Score = 25;
        }
        if(doubler.getId()==4){
            this.p4Score = 25;
        }
        if(losing.getId() == 1){
            this.p1Score = -50;
        }
        if(losing.getId()==2){
            this.p2Score = -50;
        }
        if(losing.getId()==3){
            this.p3Score = -50;
        }
        if(losing.getId()==4){
            this.p4Score = -50;
        }

    }

    public void notDoubled(Player taker){
        if(taker.getId()==1)
            this.p1Score = -25;
        if(taker.getId()==2)
            this.p2Score = -25;
        if(taker.getId()==3)
            this.p3Score = -25;
        if(taker.getId()==4)
            this.p4Score = -25;
    }
    public void deleteDoubled(Player doubler, Player losing) {
        if(doubler.getId() == 1){
            this.p1Score = -25;
        }
        if(doubler.getId()==2){
            this.p2Score = -25;
        }
        if(doubler.getId()==3){
            this.p3Score = -25;
        }
        if(doubler.getId()==4){
            this.p4Score = -25;
        }
        if(losing.getId() == 1){
            this.p1Score = 50;
        }
        if(losing.getId()==2){
            this.p2Score = 50;
        }
        if(losing.getId()==3){
            this.p3Score = 50;
        }
        if(losing.getId()==4){
            this.p4Score = 50;
        }
    }
    void deleteNotDoubled(Player taker){
        if(taker.getId()==1)
            this.p1Score = 25;
        if(taker.getId()==2)
            this.p2Score = 25;
        if(taker.getId()==3)
            this.p3Score = 25;
        if(taker.getId()==4)
            this.p4Score = 25;
    }

}
