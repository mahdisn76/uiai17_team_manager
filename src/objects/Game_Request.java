package objects;

import java.util.Date;

/**
 * Created by MSN on 5/24/2017.
 */

enum GameReqStatus
{
    pending, accepted, rejected
}

public class Game_Request {
    private String OppTeamName;
    private Date date;
    private GameReqStatus gameReqStatus;

    public Game_Request(String oppTeamName, Date date, GameReqStatus gameReqStatus) {
        OppTeamName = oppTeamName;
        this.date = date;
        this.gameReqStatus = gameReqStatus;
    }

    public String getOppTeamName() {
        return OppTeamName;
    }

    public void setOppTeamName(String oppTeamName) {
        OppTeamName = oppTeamName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public GameReqStatus getGameReqStatus() {
        return gameReqStatus;
    }

    public void setGameReqStatus(GameReqStatus gameReqStatus) {
        this.gameReqStatus = gameReqStatus;
    }
}
