package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketConn {

    Socket connect;

    DataInputStream terminalInput;
    DataOutputStream socketOutput;

    public ClientSocketConn(String address, int port) throws IOException {

        try {
            connect = new Socket(address, port);
            terminalInput = new DataInputStream(System.in);
            socketOutput = new DataOutputStream(connect.getOutputStream());
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String outLine = "";
        while (!(outLine.equals("over"))) {
            outLine = terminalInput.readLine();
            socketOutput.writeUTF(outLine);
        }

        try {
            terminalInput.close();
            socketOutput.close();
            connect.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) throws IOException {
        new ClientSocketConn("127.0.0.1", 5000);
    }
}
