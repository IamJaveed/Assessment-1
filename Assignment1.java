import java.util.*;

class temperature //temperature of two cities//
{
public static void main (String... args)

{        
                    
                    Scanner sc=new Scanner(System.in);
                   System.out.println(" Enter  Today's Temperature in Chennai is: "); 
                   int c1=sc.nextInt();
      
                   System.out.println("Enter Today's Temperature in  Coimbature is: ");
                   int c2=sc.nextInt();
                    
             
                  
                   
                      System.out.println("Weekly Temperature in  Chennai is: "+((c1+7)-3));
                      System.out.println("Weekly Temperature in Coimbature is: "+((c2+7)-3));
                         
}
}