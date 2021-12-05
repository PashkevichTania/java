package by.gsu.pms;

import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Waiting for Connection...");
        
        try{
            Deck deck = new Deck();
            List<Card> hand =new ArrayList<>();
            int sum=0;
            
            ServerSocket socket;
            socket = new ServerSocket(40090);
            Socket sock = socket.accept( );
            System.out.println("Connection Recived From Client!");
            
            ObjectOutputStream outToClient=new ObjectOutputStream(sock.getOutputStream());
            ObjectInputStream inFromClient=new ObjectInputStream(sock.getInputStream());
            
            String cmd;
            while(true){
                cmd = (String)inFromClient.readObject();//Read a string from client

                if(cmd.matches("deal")){
                    System.out.println("Sending a new card");
                    outToClient.writeObject(deck.cardList.get(Deck.index));
                    Deck.index++;
                    System.out.println(deck.cardList.get(Deck.index).getClass());
                    outToClient.flush();
                }

                if(cmd.matches("stay")){
                    hand = (List<Card>)inFromClient.readObject();
                    System.out.println("Reciving hand from Client");
                    for (int i =0; i < hand.size();i++) {
                        sum = sum + hand.get(i).getValue();
                    }
                    System.out.println("Total Value: "+sum);
                    outToClient.writeObject(sum);
                    hand.clear();
                    sum=0;
                }
                
                if(Deck.index==52){
                    System.out.println("Error! no more cards, restart server");
                    break;  
                }
                
            }
            
            socket.close();
        }
        catch(IOException e){
        }
        
    }
    
}
