package overloding;

public class Car {
	//constructor overloding
	public Car(int race)
	{
		System.out.println("1-constructor parametr");
	}
	public Car(int race,int id)
	{
		System.out.println("2-parameter con");
		
	}
	//normal overloding
	public static void speed(int race)
	{
		System.out.println("40 km speed");
	}
	public static void speed(int race,int id)
	{
		System.out.println("40 km and 111");
	}
	public static void speed(String name,int  price)
	{
		System.out.println("name,price");
	}

}
