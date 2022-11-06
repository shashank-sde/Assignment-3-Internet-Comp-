package intcomp;

public class Surgeon extends HospitalEmployee {
	public boolean operating;

	@Override
	public String toString() {
		return super.toString()+" BrainOperating:" + operating;
	}

	public Surgeon(String string, int i, String string2, boolean b) {
		super(string, i);
		operating=b;
	}

	public void work() {
		// TODO Auto-generated method stub
		String printstmt=super.name+" works for the hospital."+""+super.name+" is operating now.";
		System.out.println(printstmt);
	}
    }
	
