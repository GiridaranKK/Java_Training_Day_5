public class CountingTheObjects {
	static int count = 0;
	public ObjectCreationMany() {
		count++;
	}
	public static void main(String[] args) {
		ObjectCreationMany obj1 = new ObjectCreationMany();
		ObjectCreationMany obj2 = new ObjectCreationMany();
		ObjectCreationMany obj3 = new ObjectCreationMany();
		ObjectCreationMany obj4 = new ObjectCreationMany();
		ObjectCreationMany obj5 = new ObjectCreationMany();
		System.out.print("Object is created "+ count +" times");
	}

}

//Output:
	Object is created 5 times
