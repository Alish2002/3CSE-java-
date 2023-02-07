import java.io.*;
public class practical_10 {
    public static void main(String args[])
    {
        File fin = new File("practical10.txt");
        File fout = new File("practicalfile.txt");
        FileReader fr = null;
        FileWriter fw = null;
        try
        {
            fr = new FileReader(fin);
            fw = new FileWriter(fout);
            int ch;
            while((ch = fr.read())!= -1){
                fw.write(ch);
            }
            System.out.println("Check your file now");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            try{
                fr.close();
                fw.close();
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    
}
