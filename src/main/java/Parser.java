import java.io.IOException;
import java.net.URL;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Parser {

    private static Document getPage() throws IOException {
        final String URL = "https://albiononline2d.com/en/item";
        Document page = Jsoup.parse(new URL(URL), 2000);
        return page;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPage());
    }

}
