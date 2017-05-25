package objects;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by MSN on 5/24/2017.
 */
public class Team
{
    private String Team_Name;
    private ArrayList<String> member_names = new ArrayList<>();
    private ArrayList<Code> my_Codes = new ArrayList<>();
    private ArrayList<Game> my_Games = new ArrayList<>();
    private Code Selected_code;

    private ArrayList<Game_Request> sent_game_requests = new ArrayList<>();
    private ArrayList<Game_Request> recieved_game_requests = new ArrayList<>();

    public void add_code(File f, OutputStream os, languages l) throws IOException {
        //upload file
        //open progress bar here
        byte [] mybytearray  = new byte [(int)f.length()];
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(mybytearray,0,mybytearray.length);
        os.write(("upload " + l.toString() + '\n').getBytes());
        os.write(mybytearray,0,mybytearray.length);
        os.flush();

        //Then add code obj to the my_Codes arraylist
        //my_Codes.add(new Code());

        System.out.println("Done.");


    }

    public void send_game_req(String req_team_name,OutputStream os) throws IOException {
        // send request information to the server
        // run a thread that wait for servers answer (when server runs the game, it sends game log)
        os.write(("req " + req_team_name + '\n').getBytes());
        os.flush();
    }

    public ArrayList<String> getMember_names() {
        return member_names;
    }

    public ArrayList<Game_Request> getSent_game_requests() {
        return sent_game_requests;
    }

    public ArrayList<Game_Request> getRecieved_game_requests() {
        return recieved_game_requests;
    }

    public Code getSelected_code() {
        return Selected_code;
    }

    public void setSelected_code(Code selected_code) {
        Selected_code = selected_code;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String team_Name) {
        Team_Name = team_Name;
    }

    public ArrayList<Code> getMy_Codes() {
        return my_Codes;
    }

    public ArrayList<Game> getMy_Games() {
        return my_Games;
    }
}