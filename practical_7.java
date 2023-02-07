//the concept of Exception Handling by using try catch and finally. 
class practical_7{
    public static void main(String args[])
    {
        int i = 10, r = 0;
        try
        {
            int j = Integer.parseInt(args[2]);
            r = i/j;
        }
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
            System.out.println(ex.getMessage());
        }
        catch(NumberFormatException ex)
        {
            System.out.println(ex);
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println(ex);
        }
        finally
        {
            System.out.println("In finally block");
            System.out.println("Value of r is:" +r);
            System.out.println("Now Exit the program"); 
        }
    }
}

