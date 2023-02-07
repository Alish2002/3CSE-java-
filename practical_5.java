// method overriding
class Parent {
    void display(){
        System.out.println("parent display()");
    }
    void fun(){
        System.out.println("parent class fun invoked");
    }
}
class child extends Parent {
    void display(){
        System.out.println("child display()");
    }
    void show(){
        System.out.println("child Fun");
    }
}
class practical_5{
    public static void main(String args[])
    {
        Parent obj = new child();
        obj.display();
        obj.fun();
    }
}
 