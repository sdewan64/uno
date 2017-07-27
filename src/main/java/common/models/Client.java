package common.models;

import java.io.DataInputStream;
import java.io.DataOutputStream;

public class Client {

    private int id;
    private DataInputStream toClient;
    private DataOutputStream fromClient;

    public Client(int id, DataInputStream toClient, DataOutputStream fromClient) {
        this.id = id;
        this.toClient = toClient;
        this.fromClient = fromClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DataInputStream getToClient() {
        return toClient;
    }

    public void setToClient(DataInputStream toClient) {
        this.toClient = toClient;
    }

    public DataOutputStream getFromClient() {
        return fromClient;
    }

    public void setFromClient(DataOutputStream fromClient) {
        this.fromClient = fromClient;
    }
}
