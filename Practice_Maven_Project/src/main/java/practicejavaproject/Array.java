package practicejavaproject;

public class Array {
	
String strArray[]= {"A","B","C","D","E"};
int a[]= {1,2,4,7,6,3};
int b[]= {10,23,34,67,65};

int c[]=new int[4];
int arrAddition;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array obj=new Array();
		obj.iterateArray();
obj.arrayAddition();
	}
public void iterateArray()
{
	for(int i=0;i<strArray.length;i++)
	{
		System.out.println(strArray[i]);
	}
}
public void arrayAddition()
{
	for(int i=0;i<a.length;i++)
	{
		arrAddition+=a[i];
	
	}
	System.out.println(arrAddition);
	
}
}
