package objects;

import consts.GameRequestStatus;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by MSN on 5/24/2017.
 */
public class Team {
    private String name;
    private ArrayList<String> members;
    private ArrayList<Code> codes;
    private ArrayList<Game> games;
    private Code selected;

    private ArrayList<GameRequest> sentRequests;
    private ArrayList<GameRequest> receivedRequests;

    public Team(String name, String member1, String member2) {
        this.name = name;
        members = new ArrayList<>();
        members.add(member1);
        members.add(member2);
        codes = new ArrayList<>();
        games = new ArrayList<>();
        sentRequests = new ArrayList<>();
        receivedRequests = new ArrayList<>();
    }


    public void addCode(File f) {
        // upload file here. Then add code obj to the codes arraylist
    }

    public void sendRequest(String req_team_name) {
        // send request information to the server
        // run a thread that wait for servers answer (when server runs the game, it sends game log)
    }

    public int getPendingCount() {
        int n = 0;
        for (GameRequest gr : receivedRequests)
            if (gr.getStatus() == GameRequestStatus.PENDING)
                ++n;
        return n;
    }

    public ArrayList<String> getMembers() {
        return members;
    }

    public ArrayList<GameRequest> getSentRequests() {
        return sentRequests;
    }

    public ArrayList<GameRequest> getReceivedRequests() {
        return receivedRequests;
    }

    public Code getSelectedCode() {
        return selected;
    }

    public void setSelected(Code selected) {
        this.selected = selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Code> getCodes() {
        return codes;
    }

    public ArrayList<Game> getGames() {
        return games;
    }
}
