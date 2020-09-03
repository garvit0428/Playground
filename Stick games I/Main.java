import java.util.*;
import java.io.*;
public class Main{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    int n = Integer.parseInt(""+s.charAt(0));
    int m = Integer.parseInt(""+s.charAt(2));
    if(n>=m){
      if(m%2==0)
        System.out.println("Mani Iyer");
      else
        System.out.println("Arun Gupta");
    }else{
      if(n%2==0)
        System.out.println("Mani Iyer");
      else
        System.out.println("Arun Gupta");
    }
  }
}