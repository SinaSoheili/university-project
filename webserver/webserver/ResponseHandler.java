package main.java.net.sinasoheili.webserver;

import java.io.*;
import java.net.Socket;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class ResponseHandler implements Runnable {

    private Socket socket;

    public static final String PAGE_ONE = """
            <html>
                <head>
                    <title>Oh my WebServer</title>
                </head>
                <body>
                    <h1>PAGE ONE!</h1>
                    <p>Please visit <a href="http://sinasoheili.net">here</a></p>
                </body>
            </html>""";

    public static final String PAGE_TWO = """
            <html>
                <head>
                    <title>Oh my WebServer</title>
                </head>
                <body>
                    <h1>PAGE TWO!</h1>
                    <p>Please visit <a href="http://sinasoheili.net">here</a></p>
                </body>
            </html>""";

    public ResponseHandler(Socket socket) {
        this.socket = socket;
        System.out.println("new connection on port : "+socket.getPort());
    }

    @Override
    public void run() {
        String responseString;
        try {
            String pageNumber = getPathParam(socket.getInputStream());
            if (pageNumber.equals("one")) {
                responseString = createResponse(PAGE_ONE);
            } else {
                responseString = createResponse(PAGE_TWO);
            }

            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write(responseString, 0, responseString.length());
            writer.flush();

            writer.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String createResponse(String body) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Date: ", Calendar.getInstance().getTime().toString());
        headers.put("Content-Type: ", "text/html; charset=UTF-8");
        headers.put("Content-Length: ", String.valueOf(body.length()));
        headers.put("Connection: ", "close");

        StringBuilder response = new StringBuilder();
        response.append("HTTP/1.1 200 OK\n");
        for (String key : headers.keySet()) {
            String value = headers.get(key);
            response.append(key + value + "\n");
        }
        response.append("\n");
        response.append(body);

        return response.toString();
    }

    public String getPathParam(InputStream inputStream) {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            String param = bufferedReader.readLine().split(" ")[1];
            if (param.equals("/one")) {
                return "one";
            } else {
                return "two";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "one";
        }
    }
}
