// //Lion class
// package animalspack;
// public class Lion
// {
//     private String color;
//     private float weight;
//     private int age;
//     public Lion(String color, float weight, int age)
//     {
// 		this.color=color;
// 		this.weight=weight;
// 		this.age=age;
// 		System.out.println("Lion: color, weight and age is: "+color+" "+weight+" and "+age);
//     }
//     public boolean isVegetarian()
//     {
// 		return false;
// 	}
// 	public boolean canClimb()
// 	{
// 			return false;
// 	}
// 	public String getSound()
// 	{
// 			return "roaring";
// 	}

// }


//Elephant class
package animalspack;
public class Elephant
{
    private String color;
    private float weight;
    private int age;
    public Elephant(String color, float weight, int age)
    {
		this.color=color;
		this.weight=weight;
		this.age=age;
		System.out.println("Elephant color, weight and age is: "+color+" "+weight+" and "+age);
    }
    public boolean isVegetarian()
    {
		return true;
	}
	public boolean canClimb()
	{
			return false;
	}
	public String getSound()
	{
			return "trumpeting";
	}
}