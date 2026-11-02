package ObserverDesignPattern.CricBuzz;

public class Main {

    public static void main(String[] args) {

        CricketMatch cricketMatch = new CricketMatch();

        ScoreBoard scoreBoard = new ScoreBoard();

        cricketMatch.addObserver(scoreBoard);


        cricketMatch.addRuns(4);

        cricketMatch.addRuns(6);

        cricketMatch.addRuns(1);


        cricketMatch.wicket();

        cricketMatch.addRuns(4);


        cricketMatch.wicket();


        cricketMatch.addOver();

        cricketMatch.addRuns(6);
        cricketMatch.addRuns(0);
        cricketMatch.addRuns(1);
        cricketMatch.addRuns(2);
        cricketMatch.addRuns(3);
        cricketMatch.addRuns(4);

        cricketMatch.addOver();
        cricketMatch.addRuns(0);
        cricketMatch.wicket();
    }
}