import java.io.*;
class voting{
  public static void main(String [] args)throws IOException{
    System.out.println("enter your age");
    InputStreamReader reader=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(reader);
    String text=in.readLine();
    int age=Integer.parseInt(text);
    if(age>=18){
      System.out.println("eligible");
    }
    else{
      System.out.println("not eligible");
    }
  }
}
