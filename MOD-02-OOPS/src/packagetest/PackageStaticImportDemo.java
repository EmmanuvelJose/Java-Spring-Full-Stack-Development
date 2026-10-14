package packagetest;

//Note: static keyword after import
import static java.lang.System.*;

public class PackageStaticImportDemo {

	public static void main(String[] args) {
		// We don't need to use 'System.' as imported using static
		out.println("hiii...");
	}

}
