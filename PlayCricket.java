interface CricketPlayer {
    void BeABatter();
    void BeABowler();
}

class PlayCricket implements CricketPlayer {
    public void BeABatter() {
        System.out.println("Playing as a batter: focusing on scoring runs.");
    }

    public void BeABowler() {
        System.out.println("Playing as a bowler: focusing on taking wickets.");
    }

    public static void main(String[] args) {
        PlayCricket player = new PlayCricket();
        player.BeABatter();
        player.BeABowler();
    }
}