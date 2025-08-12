import java.util.*;
class Tax{
	public static void main(String [] args){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter income");
	String text=sc.nextLine();
	int income=Integer.parseInt(text);
	text=sc.nextLine();
	int emp_category=Integer.parseInt(text);
	double allowance=0;
	switch(emp_category){
	case 1:
		allowance=0.05;break;
	case 2:
		allowance=0.07;break;
	case 3:
 		allowance=0.10;break;
	}
 	double  allowance_of_emp=income*allowance;
	System.out.println(allowance_of_emp);
}
}
