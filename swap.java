// get two numbers as input from user and swap them without using temporary no. //

import java.util.*;
class swap
{
 public static void main(String args[])
 {
    Scanner sw=new Scanner(System.in);
    int x=sw.nextInt();
    int y=sw.nextInt();

{
    System.out.println("x="+x);
    System.out.println("y="+y);
    x=x+y;
    y=x-y;
    x=x-y;
    System.out.println("x="+x);
    System.out .println("y="+y);

}
}


}