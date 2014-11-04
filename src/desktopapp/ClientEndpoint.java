package desktopapp;

import java.net.URI;

import org.java_websocket.client.WebSocketClient;
import org.java_websocket.drafts.Draft;
import org.java_websocket.framing.Framedata;
import org.java_websocket.handshake.ServerHandshake;


public class ClientEndpoint extends WebSocketClient {
    public Boolean conn = false;
    
    public ClientEndpoint(URI serverUri, Draft draft) {
        super(serverUri, draft);
    }

    public ClientEndpoint(URI serverURI) {
        super(serverURI);
    }

    @Override
    public void onOpen(ServerHandshake handshakedata) {
        System.out.println("opened connection");
        conn = true;
    }

    @Override
    public void onMessage(String message) {
        //System.out.println("received: " + message);
        Daemon.logText(message);
    }

    // ?
    public void onFragment(Framedata fragment) {
        System.out.println("received fragment: " + new String(fragment.getPayloadData().array()));
    }

    // Co se stane, je-li spojení ukončeno
    @Override
    public void onClose(int code, String reason, boolean remote) {
        System.out.println("Connection closed by " + (remote ? "remote peer" : "us"));
        conn = false;
    }

    // Co se stane při chybě
    @Override
    public void onError(Exception ex) {
        ex.printStackTrace();
    }
}
