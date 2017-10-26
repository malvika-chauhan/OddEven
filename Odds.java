import java.util.*;
class Odds
{
  public static void main(String args[])
  {
   String Ob="odds";
   String Eb="even";
   String s,y;
   int usernumber,sum=0;
   
   System.out.println("lets play a game called odds and evens");
    Scanner in =new Scanner(System.in);
   System.out.println("whats your name");
    s=in.nextLine();
   System.out.println("hie  "+s+"  which do you choose? odds or evens?");
    y=in.nextLine();
   if(y.equals(Ob))
    System.out.println("hie you choose odd then the computer will be even");
   else 
    System.out.println("You choose even so computer will be odd");
   
   System.out.println("*****************************************8");
   System.out.println("How many fingers do you put out?");
    usernumber=in.nextInt();
   System.out.println("user entered this:" +usernumber);
   
   System.out.println("How many fingers do computer put out?");
   Random rand = new Random();
   int computer = rand.nextInt(6);
   
  System.out.println("The computer plays "+computer+" fingers: ");
  
   System.out.println("-------------------------------------------"); 
   sum=usernumber+computer;
   System.out.println("sum is:"+sum);
   if(((sum%2==0) && (usernumber%2==0))||((sum%2!=0) && (usernumber%2!=0)))
    { 
       System.out.println(s+" wins");
      }  
       else
       { 
         System.out.println("Computer wins");
        
    }
   
}
}