
import java.io.*;
class HelloName{
	public static void main(String []args)
 throws IOException{
		System.out.print("Enter youd name:");
		InputStreamReader reader=
new InputStreamReader(System.in);
		BufferedReader in=
 new BufferedReader (reader);
		String name=in.readLine();
		System.out.println("Your name is :"+name);
	}
}
