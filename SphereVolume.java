import java.io.*;
class SphereVolume{
	public static void main(String []args) throws IOException{
	System.out.print("Enter the radius of sphere:");
	InputStreamReader reader = new InputStreamReader(System.in);
	BufferedReader in=new BufferedReader(reader);
	String text=in.readLine();
	double r=Double.parseDouble(text);
	double volume=(4.0/3.0)*r*r*r;
	System.out.println("Radius:"+r);
	System.out.println("Volume:"+ volume);
	}
}
