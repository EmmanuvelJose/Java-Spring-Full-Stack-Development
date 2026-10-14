package interfacepack;

//Marker or tagging Interface
public interface Administrator{ //- no methods
	//eg: Serializable, Clonable used in thread
}

//Functional Interface - only one abstract method

@FunctionalInterface  //-annotations
interface Employeee{
	public abstract void print();
}
public class MarkerAndFunctionalInterface {

	public static void main(String[] args) {
		//code
	}

}
