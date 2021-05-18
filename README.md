# Pattern2
Print the Rectangle pattern, in side the rectangle give the name.

In this we are using Scaneer class for to get user input , and it is found in the java.util package.

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter name");
           String name=sc.next();
// Taking the  requirements for printing the pattern

            int length = name_length+16, wid = 10;
            
// For printing the rectangle we use the for loop with if condition, wid means width of the rectanle
if condition satisfied then it print * and else it print -.
 
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
//printing the name 

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
               
            
            
            
