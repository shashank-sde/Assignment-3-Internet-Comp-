package intcomp;

public class Nurse extends HospitalEmployee{
	public int numOfPatients;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+super.name+" "+super.number+" has "+numOfPatients+" patients";
	}

	public Nurse(String string, int i, int j) {
		super(string,i);
		numOfPatients=j;
	}
	
	public void work() {
		String printstmt=super.name+" works for the hospital."+""+super.name+" is a nurse with "+numOfPatients+" patients.";
		System.out.println(printstmt);
	}
	
	
}
