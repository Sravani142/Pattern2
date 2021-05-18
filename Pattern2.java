import java.util.*;
class Pattern2
{
       public static void main(String[] args)
        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name=sc.next();
            int name_length = name.length();

            int length = name_length+16, wid = 10;

            for(int i =1; i<=wid; i++)
            {
                 if((i==1) || (i==wid))
                 {
                   for(int j=1; j<=length; j++)
                    {
                       if(j==1 || j== length)
                       System.out.print("+");
                      else
                       System.out.print("-");
                   }
               }
              else if( i == wid-2)
              {
                   for(int j=1; j<=length-name_length-3; j++)
                   {
                     if(j == 1)
                     System.out.print("|");
                    else
                    System.out.print(" ");
                  }
                  System.out.print(name +"  |");
            }
           else
            {
                 for(int j = 1; j <= length; j++)
                   {
                       if((j==1) || (j==length))
                       System.out.print("|");
                       else
                       System.out.print(" ");
                   }
             }
          System.out.println();
     }
  }

}


