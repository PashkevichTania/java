package by.gsu.pms;

import java.io.*;
import java.net.*;
import java.util.*;


public class Client{

    public static void main(String[] args) throws Exception{
        Scanner scan=new Scanner(System.in);
        List<Card> hand =new ArrayList<>();
        int handIndex=0;
        
        try{
            Socket sock = new Socket("localhost",40090);
            
            ObjectOutputStream outToServer=new ObjectOutputStream(sock.getOutputStream());
            ObjectInputStream inFromServer=new ObjectInputStream(sock.getInputStream());

            System.out.println("Commands For 21 points game");
            System.out.println("--------------------------------");
            System.out.println("deal to Recive a card from Server");
            System.out.println("stay to stay with current card(s)");
            System.out.println("hand to show your current card(s)");
            System.out.println("quit to close program");
            System.out.println("--------------------------------");
            String cmd;
            
            while(true){
                System.out.print("Enter a command: ");
                cmd = scan.next();

                if(cmd.matches("deal")){
                    outToServer.writeObject(cmd);
                    Card c=(Card) inFromServer.readObject();
                    hand.add(c);
                    if(c.rank.equals("Ace")){
                        System.out.print("Should Aces be 1 or 11?: ");
                        hand.get(handIndex).setValue(scan.nextInt());
                    }
                    System.out.println(c.ToString());
                    handIndex++;
                }

                if(cmd.matches("stay")){
                    outToServer.writeObject(cmd);
                    outToServer.reset();
                    outToServer.writeObject(hand);
                    int sum = (int)inFromServer.readObject();
                    System.out.println("Total Value: " + sum);
                    sum=0;
                    hand.clear();
                }

                if(cmd.matches("hand")){
                    System.out.println("------------------");
                    System.out.println("Cards in hand:");
                    for (Card hand1 : hand) {
                        System.out.println(hand1.ToString());
                    }
                    System.out.println("------------------");
                }

                if (cmd.matches("quit")){
                    break;
                }
                
                outToServer.flush();
            }
        }
        catch(IOException | ClassNotFoundException e){
        }
    }
    
}
