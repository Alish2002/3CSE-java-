// abstract class
// abstract class Bank{    
//     abstract int getRateOfInterest();    
//     }    
// class SBI extends Bank{    
//     int getRateOfInterest(){return 7;}    
//     }    
// class PNB extends Bank{    
//     int getRateOfInterest(){return 8;}    
//     }    
        
// class practical_6{    
//     public static void main(String args[]){    
//     Bank b;  
//     b=new SBI();  
//     System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
//     b=new PNB();  
//     System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");    
//     }}    
//interface class
interface Bank{  
    float rateOfInterest();  
    }  
class SBI implements Bank{  
    public float rateOfInterest(){return 9.15f;}  
    }  
class PNB implements Bank{  
    public float rateOfInterest(){return 9.7f;}  
    }  
class practical_6{  
    public static void main(String[] args){  
    Bank b=new SBI();  
    System.out.println("ROI: "+b.rateOfInterest());  
    }}  
    