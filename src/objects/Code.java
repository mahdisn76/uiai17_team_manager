package objects;

import java.net.URL;

/**
 * Created by MSN on 5/24/2017.
 */


enum languages
{
    cpp, python, java
}

public class Code {

    private URL url;
    private languages lang;

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public languages getLang() {
        return lang;
    }

    public void setLang(languages lang) {
        this.lang = lang;
    }
}
