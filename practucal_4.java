//calculator
import java.util.*;
class practical_3
{
    long add(int a, long b){
        return a+b;
    }
    double add(int a, int b){
        return a+b;
    }
    long add(long a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
class calculator{
    public static void main(String args[]){
        practical_3 obj= new practical_3();
        long x= obj.add(8, 9);
        System.out.println(x);
        System.out.println(obj.add(1, 2, 3));
        System.out.println(obj.add(2.4,8.9));

        
    }
}


