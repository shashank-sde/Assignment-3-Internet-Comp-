package intcomp;

public class HospitalEmployee {

	protected String name;
	protected int number;

	public HospitalEmployee(String string, int i) {
		this.name=string;
		this.number=i;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return ("" + name + " " + number + "");
	}
	public void work()
	{
		System.out.println (name + " works for the hospital.");
	}
}
