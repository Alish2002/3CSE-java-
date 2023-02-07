class A extends Thread{
    public void run()  //override
    {   for(int i=1; i<=5; i++)
        {
            if(i==3)
            {
            System.out.println("First thread yielded");
            Thread.yield();
            }
        System.out.println("A=" +i);
        }
    }
}
class B extends Thread{
    public void run()
    {
        for(int j=1; j<=5; j++){
            if(j==2)
        {
            try
            {
                System.out.println("second Thread sleeping");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }   System.out.println("B=" +j);
    }
                    
}
}
// class C extends Thread{
//     public void run()
//     {
//         for(int k=1; k<=5; k++){
//             if(k==4)
//             {
//                 stop();
//             }
//             System.out.println("C=" +k);
//         }
//     }
// }
class practical_9{
    public static void main(String args[])
    {
        System.out.println("start under main");
        A t1 =new A();
        B t2 =new B();
        C t3 =new C();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("Bye....");
    }
}