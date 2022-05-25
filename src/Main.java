public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("T", 1);
        Player p2 = new Player("B",2);
        Player p3 = new Player("S",3);
        Player p4 = new Player("O",4);

        Jacks j1 = new Jacks();
        j1.decrement(1,2,3,4);
        j1.setPlayerScore(p1,p2,p3,p4);

        j1.ResetScore();
        j1.setPlayerScore(p1,p2,p3,p4);

    Diamonds d1 = new Diamonds();
        Sans s1 = new Sans();

        d1.decrement(3,3,3,4);
        d1.setPlayerScore(p1,p2,p3,p4);
        s1.decrement(3,3,3,4);
        s1.setPlayerScore(p1,p2,p3,p4);


        Diamonds d2 = new Diamonds();

        d2.decrement(3,3,3,4);
        d2.setPlayerScore(p1,p2,p3,p4);

        KingHearts k1 = new KingHearts();
        k1.kingDoubled(p1,p2);
        k1.setPlayerScore(p1,p2,p3,p4);

        k1.deleteDoubled(p1,p2);
        k1.setPlayerScore(p1,p2,p3,p4);


        Queens qHearts1 = new Queens();
        Queens qSpades1 = new Queens();
        Queens qTrifles1 = new Queens();
        Queens qDiamonds1 = new Queens();

        qSpades1.Queen1Doubled(p1,p2);
        qSpades1.setPlayerScore(p1,p2,p3,p4);

        qHearts1.Queen1Doubled(p1,p2);
        qHearts1.setPlayerScore(p1,p2,p3,p4);

        qDiamonds1.Queen1Doubled(p3,p4);
        qDiamonds1.setPlayerScore(p1,p2,p3,p4);

        qTrifles1.Queen1Doubled(p4,p1);
        qTrifles1.setPlayerScore(p1,p2,p3,p4);

        qSpades1.deleteDoubled(p1,p2);
        qSpades1.setPlayerScore(p1,p2,p3,p4);

        qHearts1.deleteDoubled(p1,p2);
        qHearts1.setPlayerScore(p1,p2,p3,p4);

        qDiamonds1.deleteDoubled(p3,p4);
        qDiamonds1.setPlayerScore(p1,p2,p3,p4);

        qTrifles1.deleteDoubled(p4,p1);
        qTrifles1.setPlayerScore(p1,p2,p3,p4);











        System.out.println(p1.getTotalScore());
        System.out.println(p2.getTotalScore());
        System.out.println(p3.getTotalScore());
        System.out.println(p4.getTotalScore());


     }



}
