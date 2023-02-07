//tax on income
import java.util.*;
class practical_3
{
    public static void main(String args[])
{
    Scanner tax=new Scanner(System.in);
    String gender =tax.nextLine();
    double income =tax.nextInt();
    double Tax=0;
    if(gender.equalsIgnoreCase("male"))
        if(income<=180000)
        {
            System.out.println("No tax");
        }
        else if(income<=500000){
            Tax=income*0.01;
            System.out.println(Tax);
        }
        else if(income<=800000){
            Tax=income*0.02;
            System.out.println(Tax);
        }
        else if(income>800000){
            Tax=income*0.03;
            System.out.println(Tax);
        }
    if(gender.equalsIgnoreCase("female"))
        if(income<=190000)
        {
            System.out.println("No tax");
        }
        else if(income<=500000){
            Tax=income*0.01;
            System.out.println(Tax);
        }
        else if(income<=800000){
            Tax=income*0.02;
            System.out.println(Tax);
        }
        else if(income>800000){
            Tax=income*0.03;
            System.out.println(Tax);
        }

        


}
}