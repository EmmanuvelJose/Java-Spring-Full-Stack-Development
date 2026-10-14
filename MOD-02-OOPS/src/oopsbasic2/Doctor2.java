//Doctor Class Datatype - subclass

package oopsbasic2;

public class Doctor2 {
	int doctorId;
	String doctorName;
	
	Doctor2(int id,String name){
		doctorId = id;
		doctorName = name;
	}
	
	public void printDetails(){
		System.out.println("Doctor ID:"+ doctorId + "\nDoctor Name:" + doctorName);
		
	}

}
