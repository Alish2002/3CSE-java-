 // client
import java.io.*;
import java.net.*;
class Client{
    public static void main(String args[])
    {
        try{
            String ip = "127.0.0.1";
            final int PORT = 12345;
            Socket skt = new Socket(ip, PORT);
            System.out.println("PORT NO. ="+skt.getPort());
            System.out.println("local PORT NO.="+skt.getLocalPort());
            System.out.println("New Write SOMETHING...");
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            String str = null;
            do{
                str = keyboard.readLine();
                out.println(str);
                str = in.readLine();
                System.out.println("from Server ="+str);
            }
            while(!str.equalsIgnoreCase("quit"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}


