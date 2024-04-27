class student{
	private int id;
	private String name;
	student(int id,String name)
	{
		this.id = id;
		this.name  = name;
	}

	public String name() {
		return name;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public int id()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id = id;
	}
	public void displayinfo() {
		System.out.println("id   : "+id);
		System.out.println("name : "+name);
	}
}

public class first {
	public static void main(String[] args) {
		student student1 = new student(007,"Levis");
		student1.displayinfo();
		student1.displayinfo();
		
	}

}
