package server;

import common.Utils;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

    private ServerSocket server;

    private void start(){
        try {
            server = new ServerSocket(Integer.parseInt(Utils.properties.getProperty(Utils.PROPERTY_PORT)));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Server().start();
    }

}
