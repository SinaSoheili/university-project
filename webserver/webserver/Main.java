package main.java.net.sinasoheili.webserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static final int PORT = 9090;

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(PORT);

        while(true) {
            Socket socket = serverSocket.accept();
            ResponseHandler responseHandler = new ResponseHandler(socket);

            Thread thread = new Thread(responseHandler);
            thread.start();
        }
    }
}
