public class Testing {
	
	//private variables
	private int age;
	private String name;
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
}

class Main {
	public static void main (String args[])
	{
		Testing test = new Testing();
		
		test.setAge(12);
		test.setName("hello");
		
		System.out.println("Age:" + " " + test.getAge());
		System.out.println("Name:" + " " + test.getName());
	}
}