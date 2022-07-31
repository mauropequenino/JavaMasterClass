package school.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static final int port = 1234;
    private static final ArrayList<Socket> socketList = new ArrayList<Socket>();

    public static void main(String[] args) throws IOException {
        ServerSocket ss;
        Socket s;

        try {
            ss = new ServerSocket(port);
            while ((s = ss.accept()) != null) {
                socketList.add(s);
                System.out.println("New connection!");
                sendBroadcastMsg("All conections : " + socketList.size());
            }
        } catch (IOException e) {
            System.out.println("Unexpected error");
        }
    }

    private static void sendBroadcastMsg(String msg) {
        for(Socket socket : socketList){
            OutputStream os = null;
            OutputStreamWriter osw = null;
            BufferedWriter bw = null;

            try {
                os = socket.getOutputStream();
                osw = new OutputStreamWriter(os);
                bw = new BufferedWriter(osw);
                bw.write(msg);
                bw.newLine();
                bw.flush();
            } catch (IOException e){
                System.out.println("Unexpected error");
            }
        }
    }
}