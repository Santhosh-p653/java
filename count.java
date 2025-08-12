import java.util.*;
class count{
	public  static void main(String []args){
	System.out.print("Enter the whole number");
	Scanner sc=new Scanner(System.in);
	String text=sc.nextLine();
	int count=0;
	int number=Integer.parseInt(text);
	while(number!=0){
	 number =number/10;
	count=count+1;
}	System.out.println(count);
}
}
