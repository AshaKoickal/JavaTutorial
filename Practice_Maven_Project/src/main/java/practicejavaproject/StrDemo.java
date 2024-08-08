package practicejavaproject;

public class StrDemo {

	//string variable can be 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//string can be declared in 2 ways
		String s="Welcome";
		String str=new String("welcome");
		if(s==str)
		{
			System.out.println("Refferences are same");
		}
		else
			System.out.println("Refferences are different");
		
		if(s.equals(str))
		{
			System.out.println("values are same");
		}
		else
			System.out.println("Values are different");
		int a =s.compareTo(str);
		System.out.println("comparison result:"+a);
		//String buffer/String builder
		StringBuilder str2 =new StringBuilder(1);
		str2.append("HI");
		System.out.println(str2.substring(1));
		str2.substring(1);
	}

}
