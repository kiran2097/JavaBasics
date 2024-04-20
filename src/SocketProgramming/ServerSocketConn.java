package SocketProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketConn {

    Socket clientConn;
    DataInputStream input;

    ServerSocketConn (int portNumber) throws IOException {
        ServerSocket serverConn = new ServerSocket(portNumber);

        System.out.println("Server is up at port number " + portNumber);

//        Socket clientConn = serverConn.accept();

        try {
            clientConn = serverConn.accept();
        } catch (Exception e) {
            System.out.println(e);
            clientConn.close();
        }
        input = new DataInputStream(new BufferedInputStream(clientConn.getInputStream()));

        String line = "";
        while (!(line.equals("over"))) {
         line = input.readUTF();
            System.out.println(line);
        }
        try {
            clientConn.close();
            input.close();
        } catch (Exception e) {
            System.out.println("Some exception while closing the connection");
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws IOException {
        new ServerSocketConn(2000);
    }


}
