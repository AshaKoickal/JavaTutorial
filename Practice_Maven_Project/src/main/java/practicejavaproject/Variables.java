package practicejavaproject;



public class Variables {

	static int myStaticVar;
	int instanceVar;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variables obj=new Variables();
		obj.addition(10,20);
		Variables.Subtraction(100, 50);

	}
	public static void Subtraction(int a ,  int b){
		
	//myStaticVar=a-b;
	System.out.println(myStaticVar);
	Variables instaceVarObj= new Variables();
	
	System.out.println(instaceVarObj.instanceVar);
	}
	public void addition(int a , int b)
	{
		//Local variable. defined within a method/code block,remains in memory as long as method executes
		//requires initialization before usage
		int c=a+b;
		System.out.println(c);
	}
	
	}

