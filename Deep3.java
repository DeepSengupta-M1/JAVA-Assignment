package Deep;

interface Hello
	{
		void World();
	}

interface Hi extends Printable
	{
		void Coders();
	}

class Deep3 implements Showable{
	public void print()
		{
			System.out.println("Hello,");
		}
	public void show()
		{
			System.out.println("I am a programmer");
		}
public static void main(String args[])
	{
		Deep3 obj=new Deep3();
	
		obj.print();
		obj.show();
	}
}