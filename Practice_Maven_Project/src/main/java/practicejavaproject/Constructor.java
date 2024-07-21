package practicejavaproject;

public class Constructor {
	
	// 3 types of :-default, parameterized, no-argument
	//no return type
	//Block of code similar to methods
	//At the time of calling constructor, memory is alloacted, use:-Initialize object
//This key word:- 3 uses:- invoke current class Instance variable,instance method, constructor
	int instanceVar=20;
	public void instanceMethod(int a)
	{
		
		System.out.println(this.instanceVar);
		this.secondInstanceMethod(300);
	}
	
	public void secondInstanceMethod(int a)
	{
		
		System.out.println("Instance method");
	}
	public Constructor()
	{
		this("Parameterised Constructor");
		System.out.println("default constructor");
		
	}
	public Constructor(String s)
	{
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor obj=new Constructor("Parameterised Constructor");
		Constructor obj1=new Constructor();
		//System.out.println(obj1this.instanceVar)
		obj1.instanceMethod(200);
		

	}

}
