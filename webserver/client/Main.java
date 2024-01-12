package main.java.net.sinasoheili.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

public class Main {

    public static final int SERVER_PORT = 9090;

    public static void main(String[] args) throws IOException {
        //127.0.0.1
        InetAddress localHostInetAddress = InetAddress.getLocalHost();

        Socket socket = new Socket(localHostInetAddress, SERVER_PORT);

        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String data = bufferedReader.readLine();
        System.out.println(data);

        System.out.println("Connection closed. Finish");
    }
}
