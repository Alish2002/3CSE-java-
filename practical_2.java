//no. of gross, dozen and left eggs//
import java.util.*;
public class practical_2
{
 public static void main(String args[])
 {
    Scanner ct=new Scanner(System.in);
    int N=ct.nextInt();
    int gross=0;
    int n=0;
    int dozen=0;
    int l=0;
    gross=N/144;
    n=N%144;
    dozen=n/12;
    l=N%12;
    {
        System.out.println("No. of eggs in gross are" + " "+gross);
        System.out.println("No. of eggs in dozen are"+ " "+dozen);
        System.out.println("No. of left eggs are"+ " "+l);
    }




}




}