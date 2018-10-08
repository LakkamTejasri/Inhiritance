package overriding;

public class Car {
	//overriding doest not support constructor oveerrinnding
	public Car(int race)
	{
		System.out.println("1-constructor parametr");
	}
	public Car(int race,String id)
	{
		System.out.println("2-parameter con");
		
	}
	//normal overloding
	public  void Break(int race)
	{
		System.out.println("40 km speed");
	}
	
	public String speed(String name)
	{
		return name;
	}

}
