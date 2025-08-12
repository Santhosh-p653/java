import java.io.*;
class bonus{
 public static void main(String [] args) throws IOException{
  System.out.println("Enter your salary");
  InputStreamReader reader=new InputStreamReader(System.in);
  BufferedReader in=new BufferedReader(reader);
  String text=in.readLine();
  int
  salary=Integer.parseInt(text);
  double bonus;
  if(salary>=10000){
    bonus=0.10*salary;
  }
  else{
    bonus=0.05*salary;
  }
  System.out.println(bonus);
}
}
