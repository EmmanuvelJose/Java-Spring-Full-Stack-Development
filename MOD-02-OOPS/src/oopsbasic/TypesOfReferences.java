//Types of References in Java

package oopsbasic;

import java.lang.ref.*;

class User1 {
	int id;

	User1(int id) {
		this.id = id;
		System.out.println("User object created : " + id);
	}

	@Override
	protected void finalize() {
		System.out.println("User object finalized : " + id);
	}
}

public class TypesOfReferences {

	public static void main(String[] args) throws Exception {

		/* ======== STRONG REFERENCE ========= */
		User1 strongRef = new User1(1);
		System.out.println("Strong Reference object id: " + strongRef.id);

		/* ========= SOFT REFERENCE ========= */
		SoftReference<User1> softRef = new SoftReference<>(new User1(2));
		System.out.println("Soft Reference before GC: " + softRef.get());

		/* ========= WEAK REFERENCE ========= */
		WeakReference<User1> weakRef = new WeakReference<>(new User1(3));
		System.out.println("Weak Reference before GC: " + weakRef.get());

		/* ========= PHANTOM REFERENCE ========= */
		ReferenceQueue<User1> refQueue = new ReferenceQueue<>();
		PhantomReference<User1> phantomRef = new PhantomReference<>(new User1(4), refQueue);
		System.out.println("Phantom Reference get(): " + phantomRef.get());

		/* ========= GARBAGE COLLECTION ========= */
		System.out.println("\nCalling Garbage Collector...\n");
		System.gc();
		Thread.sleep(2000);

		System.out.println("Soft Reference after GC: " + softRef.get());
		System.out.println("Weak Reference after GC: " + weakRef.get());
		System.out.println("Phantom Reference enqueued: " + (refQueue.poll() != null));
	}
}
