//class Admin - user defined datatype

package oopsbasic2;

public class Admin {

	int adminId;
	String adminName;
	
	Admin(int id,String name){
		adminId = id;
		adminName = name;
	}
	
	 // Copy constructor
    public Admin(Admin ad) {
        adminId = ad.adminId;
        adminName = ad.adminName;
    }

	public void printDetails(){
		System.out.println("Admin ID:"+ adminId + "\nAdmin Name:" + adminName);
		
	}
}
