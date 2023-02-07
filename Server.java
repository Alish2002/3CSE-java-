// server
import java.io.*;
import java.net.*;
class Server{
    public static void main(String args[])
    {
        try{
            final int PORT = 12345;
            ServerSocket sskt = new ServerSocket(PORT);
            System.out.println("My Server started....");
            System.out.println("PORT NO.="+sskt.getLocalPort());
            System.out.println("Waiting for client connection....");
            // ssKt.setSoTimeOut(5000);
            Socket skt = sskt.accept();
            System.out.println("Yes, client connected"+skt);
            BufferedReader in = new BufferedReader(new InputStreamReader(skt.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(skt.getOutputStream(), true);
            String str = null;
            do{
                str = in.readLine();
                System.out.println("from client ="+str);
                str = keyboard.readLine();
                out.println(str);
            }
            while(!str.equalsIgnoreCase("quit"));
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
}
