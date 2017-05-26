package objects;

import consts.Language;

import java.io.File;
import java.net.URL;

/**
 * Created by MSN on 5/24/2017.
 */

public class Code {

    private String title;
    private URL url;
    private Language lang;

    public Code(String title, Language lang, URL url) {
        this.title = title;
        this.lang = lang;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public URL getUrl() {
        return url;
    }

    public File download() {
        // TODO: 2017-05-26 download file from server
        return null;
    }

    public Language getLanguage() {
        return lang;
    }
}
