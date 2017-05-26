package objects;

import consts.GameRequestStatus;

/**
 * Created by MSN on 5/24/2017.
 */

public class GameRequest {

    private String senderTeam, recieverTeam;
    private String reqName;
    private GameRequestStatus gameReqStatus;

    public GameRequest(String senderTeam, String recieverTeam, String reqName) {
        this.senderTeam = senderTeam;
        this.recieverTeam = recieverTeam;
        this.reqName = reqName;
        this.gameReqStatus = GameRequestStatus.PENDING;
    }

    public String getSenderTeam() {
        return senderTeam;
    }

    public String getRecieverTeam() {
        return recieverTeam;
    }

    public String getName() {
        return reqName;
    }

    public GameRequestStatus getStatus() {
        return gameReqStatus;
    }

    public void setStatus(GameRequestStatus gameReqStatus) {
        this.gameReqStatus = gameReqStatus;
    }
}
