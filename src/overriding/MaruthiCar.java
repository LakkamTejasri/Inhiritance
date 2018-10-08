package overriding;

public class MaruthiCar extends Car{
	public MaruthiCar(int race)
	{
		super(race);
		System.out.println("1-subclass cons"+race);
	}
	public MaruthiCar(int race,String id){
		super(race,id);
		System.out.println("2-sub class con"+race);
		System.out.println("car id: " +id);
		
		
		
	}
	public String speed(String name)
	{
//		System.out.println("sub class name: "+name);
//		System.out.println("sub class price: "+price);
		return name;
	}
	public  void Break(int race)
	{
		System.out.println("45667 km speed");
	}

}
