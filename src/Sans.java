public class Sans extends GameMode implements Lamaat, Delete{

        private int p1lamaat;
        private int p2lamaat;
        private int p3lamaat;
        private int p4lamaat;

        @Override
        public void decrement(int p1lama, int p2lama, int p3lama, int p4lama) {
            if(p1lama+p2lama+p3lama+p4lama == 13){
                this.p1lamaat = p1lama;
                this.p2lamaat = p2lama;
                this.p3lamaat = p3lama;
                this.p4lamaat = p4lama;

                this.p1Score = -15 * p1lama;
                this.p2Score = -15 * p2lama;
                this.p3Score = -15 * p3lama;
                this.p4Score = -15 * p4lama;
            }
            else {
                System.out.println("feh 3'alat fel lamaat el Sans");
            }

        }

       /* @Override
        public void setPlayerScore(Player p1, Player p2, Player p3, Player p4) {
            p1.setRoundScore(this.p1Score);
            p1.setTotalScore();
            p2.setRoundScore(this.p2Score);
            p2.setTotalScore();
            p3.setRoundScore(this.p3Score);
            p3.setTotalScore();
            p4.setRoundScore(this.p4Score);
            p4.setTotalScore();
        }*/


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
        // on deletion
        @Override
        public void ResetScore() {

            this.p1Score = 15 * this.p1lamaat;
            this.p2Score = 15 * this.p2lamaat;
            this.p3Score = 15 * this.p3lamaat;
            this.p4Score = 15 * this.p4lamaat;

        }


/*
    @Override
    public void subtractFromTotal(Player p1, Player p2, Player p3, Player p4) {


    }*/
    }


