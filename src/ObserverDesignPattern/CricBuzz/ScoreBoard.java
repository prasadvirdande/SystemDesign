package ObserverDesignPattern.CricBuzz;

public class ScoreBoard implements Observer {

    @Override
    public void update(CricketMatch cricketMatch) {

        System.out.println(
                "Score: "
                        + cricketMatch.getRuns()
                        + "/"
                        + cricketMatch.getWickets()
                        + " | Over: "
                        + cricketMatch.getOver()
        );
    }
}