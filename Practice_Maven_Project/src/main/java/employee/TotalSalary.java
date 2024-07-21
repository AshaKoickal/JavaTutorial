package employee;

public class TotalSalary {

public static void main(String[] args) 
{
BasicDetails obj=new BasicDetails();
Hra obj1=new Hra();

int hra=obj1.CalculateHra();
int pf=obj1.CalculatePf();
int salarySlip=TotalSalary.salarySlip(obj.basicPay,obj.bonus,obj.deduction,hra,pf);
System.out.println("Salary Slip");
System.out.println("------------");
System.out.println("Basic Pay: "+obj.basicPay);
System.out.println("Bonus:     "+obj.bonus);
System.out.println("Deduction: "+obj.deduction);
System.out.println("HRA:       "+hra);
System.out.println("PF:        "+pf);
System.out.println("Total Salary: "+salarySlip);
	}

	public static int salarySlip(int basicPay,int bonus,int deduction, int hra,int pf)
	{	
		int totalSalary=(basicPay+bonus+hra+pf)-deduction;
		return totalSalary;
	}
	}



