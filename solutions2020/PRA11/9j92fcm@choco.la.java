import java.net.*;
import java.io.*;

public class PRA11 {
    public static void main(String[] args) throws Exception {
        URL yahoo = new URL("http://52.39.240.89:8080/");
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}