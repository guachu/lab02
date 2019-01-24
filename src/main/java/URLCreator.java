import java.net.MalformedURLException;
import java.net.URL;

public class URLCreator {
    public URLCreator(String u){
        try
        {
            URL myURL = new URL(u);
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
    }
}
