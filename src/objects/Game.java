package objects;

import java.net.URL;
import java.util.Date;

/**
 * Created by MSN on 5/24/2017.
 */
public class Game {

    private String name;
    private String team1Name, team2Name, winner;
    private URL logURL;

    public Game(String gameName, String team1Name, String team2Name, String winner) {
        this.name = gameName;
        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.winner = winner;
    }

    public String getName() {
        return name;
    }

    public String getTeam1Name() {
        return team1Name;
    }

    public String getTeam2Name() {
        return team2Name;
    }

    public URL getLogURL() {
        return logURL;
    }

    public void setLogURL(URL logURL) {
        this.logURL = logURL;
    }

    public String getWinnerName() {
        return winner;
    }

}
