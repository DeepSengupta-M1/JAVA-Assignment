package Deep;
//Creating interface that has 4 methods

interface A{

	void a(); //by default, public and abstract
	void b();
	void c();
	void d();
}

//Creating abstract class that provides the implementation of one method of A interface

abstract class B implements A{
	public void c()
		{
			System.out.println("Deep");
		}
}

//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods
class M extends B{
	public void a()
		{
			System.out.println("Hello");
		}
	public void b()
		{
			System.out.println("My Name is");
		}
	public void d()
		{
			System.out.println("Sengupta");
		}
}

//Creating a test class that calls the mthods of A interface
class Deep{

	public static void main(String[] args){
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}