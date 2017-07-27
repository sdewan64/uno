package server;

import common.models.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientAdder extends Thread {

    private ServerSocket server;
    private int clientId = 0;

    public ClientAdder(ServerSocket server){
        this.server = server;
    }

    @Override
    public void run() {
        while (!interrupted()){
            try{
                Socket clientSocket = server.accept();
                DataInputStream toClient = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream fromClient = new DataOutputStream(clientSocket.getOutputStream());
                Client client = new Client(clientId++, toClient, fromClient);
                GameEngine.allConnectedClients.add(client);
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
