class Person {
public String name;
public int height;
}
class Sample {
	public static void main(String args[]) {
		Person p = new Person();
		p.name = "EJava";
		
		anotherMethod(p);
		
		System.out.println(p.name);
		
		someMethod(p);
		
		System.out.println(p.name);
	}
	static void someMethod(Person p) {
		p.name = "someMethod";
		System.out.println(p.name);
	}
	static void anotherMethod(Person p) {
		p = new Person();
		p.name = "anotherMethod";
		System.out.println(p.name);
	}
}