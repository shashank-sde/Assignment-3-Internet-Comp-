package intcomp;

public class Doctor extends HospitalEmployee {
	public String speciality;
    
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" "+speciality;
	}

	public Doctor(String string, int i, String string2) {
		super(string, i);
		speciality=string2;
	}
	
	public void work() {
		String printstmt=super.name+" works for the hospital."+""+super.name+" is a "+speciality+" doctor.";
		System.out.println(printstmt);
	}

	

	
	
}
