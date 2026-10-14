package accesspackone;

public class FirstClass {
	public int i;
	protected int j;
	private int k;
	int l;

	void print() {
		System.out.println(i); // public
		System.out.println(j); // protected
		System.out.println(l); // Default
		System.out.println(k); // Private
	}
}
