import java.util.Scanner;

public class LEVEL {  
    public static void main(String[] args) {
      Scanner X = new Scanner(System.in);
      System.out.println("enter the 1st number:");
      int x = X.nextInt();
      Scanner Y = new Scanner(System.in);
      System.out.println("enter the 2nd number:");
      int y = Y.nextInt();
      if (y>x){
        System.out.println(y + " is bigger.");
      }
      else if (y<x){
        System.out.println(x + " is bigger.");
      }
      else
      System.out.println(x + " is equal to " + y);
    }
      
    
}
