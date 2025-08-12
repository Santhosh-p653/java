import java.io.*;
class CurrencyConversion{
	public static void main (String []args) throws IOException{
	System.out.println("Enter the amount in dollars");
	InputStreamReader reader =new InputStreamReader(System.in);
	BufferedReader in=new BufferedReader(reader);
	String text=in.readLine();
	int dollars=Integer.parseInt(text);
	int rupees=47*dollars;
	System.out.println("Amount in dollars:"+dollars);
	System.out.println("Amount in rupees:"+rupees);
	}
}
