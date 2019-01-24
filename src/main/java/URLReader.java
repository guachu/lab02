import java.io.*;
import java.net.*;
import java.util.Scanner;
//import org.apache.commons.io.FileUtils;


public class URLReader {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String newLink = scanner.nextLine();
        URL google = new URL(newLink);
        File archivoHtml = new File("web/resultado.html");
        String datos = "Protocolo: " + google.getProtocol() +
                "<br> Autoridad" + google.getAuthority();
        System.out.println(google.getHost());
        System.out.println(google.getPort());
        System.out.println(google.getPath());
        System.out.println(google.getQuery());
        System.out.println(google.getFile());
        System.out.println(google.getRef());


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))) {

            String inputLine = null;
            while ((inputLine = reader.readLine()) != null) {
                System.out.println(inputLine);
            }

        } catch (IOException x) {
            System.err.println(x);

        }
    }

}


