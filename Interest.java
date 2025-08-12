import java.io.*;
class Interest{
  public static void main(String []args)throws IOException{
    System.out.println("Enter deposit amount");
    InputStreamReader reader=new InputStreamReader (System.in);
    BufferedReader in=new BufferedReader(reader);
    String text=in.readLine();
    int p=Integer.parseInt(text);
    text=in.readLine();
    int n=Integer.parseInt(text);
    double rate;
    if(p>10000){
      rate=0.11;
    }
    else {
      if(n>10){
        rate=0.10;
      }
      else {
        rate=0.09;
      }
    }
    double interest=n*p*rate;
    System.out.println(interest);
    
    }
}
