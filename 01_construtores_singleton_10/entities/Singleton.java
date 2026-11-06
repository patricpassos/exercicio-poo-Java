package entities;

public class Singleton {
	
	private static Singleton singleInstance;
	private int quantityLogins;
	private static int instanceCount;
	
	private Singleton() {
		instanceCount++;
	};
	
	public static Singleton getInstance() {
		if(singleInstance == null) {
			synchronized (Singleton.class) {
				if (singleInstance == null) { // 2ª Checagem: garante que ninguém criou enquanto esperava na fila
					singleInstance = new Singleton();
				}
			}
		}
		return singleInstance;
	}
	
	public void quantityLogs() {
		quantityLogins++;
	}
	
	public static void resetInstance() {
		synchronized (Singleton.class) {
			singleInstance = null; 
		}
	}
	
	public static int getInstanceCount() {
		return instanceCount;
	}

	@Override
	public String toString() {
		return
				"Quantity logins: " + quantityLogins + "\n" + 
				"Number of instances created: " + instanceCount;
	}
}
