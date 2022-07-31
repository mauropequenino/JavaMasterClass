package school.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static Socket s;

    public static void main(String[] args) throws IOException{
        try {
            s = new Socket("127.0.0.1", 1234);
            System.out.println("New connection");
            readMsgFromServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readMsgFromServer(){
        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try{
            is = s.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An unexpected error");
        }
    }
}
