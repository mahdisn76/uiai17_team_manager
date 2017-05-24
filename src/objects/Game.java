package objects;

import java.net.URL;
import java.util.Date;

/**
 * Created by MSN on 5/24/2017.
 */
public class Game {
    private Date date = new Date();
    private String OppTeamName;
    private URL url;

    Game(Date t_date, String t_OppTeamName, URL t_url)
    {
        date = t_date;
        OppTeamName = t_OppTeamName;
        url = t_url;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOppTeamName() {
        return OppTeamName;
    }

    public void setOppTeamName(String oppTeamName) {
        OppTeamName = oppTeamName;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
