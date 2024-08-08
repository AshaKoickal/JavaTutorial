package PracticeInheritance;
import PracticeAggregation.Name;
import practicejavaproject.Encapsulation1;
public class Dog extends Animal{

	Name nm;
	public static void main(String[] args) {
		
		Name name=new Name("Betty");
		// TODO Auto-generated method stub
		Encapsulation1 obj=new Encapsulation1();
		obj.setter(170);
		int s=obj.getter();
		System.out.println(s);
Dog d= new Dog();

//nm
System.out.println(d.a);


	}
	public Dog()
	{
		System.out.println("Parent constructor");
		//nm.name;
		//System.out.println(dogName);
	}

}
