/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desktopapp;

import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JTextArea;
import org.java_websocket.drafts.Draft_10;

/**
 *
 * @author Dominik
 */
public class Daemon {

    private static Daemon instance = null;
    private ClientEndpoint client;
    private static JTextArea log;

    protected Daemon() {
        try {
            client = new ClientEndpoint(new URI("ws://94.113.135.14:8080/TestEJB/echo"), new Draft_10());
        } catch (URISyntaxException ue) {
            System.out.println("Connection failed");
        }
    }
    
    public static void logText(String str){
        log.append(str + "\n");
    }

    public static Daemon getInstance() {
        if (instance == null)
            instance = new Daemon();
        
        return instance;
    }

    public void setLog(JTextArea log) {
        this.log = log;
    }
    
    
    
    public ClientEndpoint getClient(){
        return client;
    }

}
