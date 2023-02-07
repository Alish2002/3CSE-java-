class adder
{
    long add(long a, int b){
        return a+b;
        }
    double add(int a, double b){
        return a+b;
    }
}
class practical_4{
     public static void main(String args[]){
        adder s1 = new adder();
        long x = s1.add(2, 4);
        System.out.println(x);
        double y = s1.add(6.6, 6.6);
        System.out.println(y);
    }

}