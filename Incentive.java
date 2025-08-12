import java.io.*;
class Incentive{
	public static void main(String []args)
throws  IOException{
	System.out.println("Enter Sales amount:");
	InputStreamReader reader =
new InputStreamReader(System.in);
	BufferedReader in=new BufferedReader(reader);
	String text=in.readLine();
	int salesAmount=Integer.parseInt(text);
	double incentive=0.10*salesAmount;
	System.out.println("Incentive="+incentive);
	}
}
