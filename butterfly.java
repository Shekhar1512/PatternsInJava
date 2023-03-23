 class butterfly
{
  public static void main(String args[])
     {
                   System.out.print("\n\n");                                     

int n=4;
          //loop 1
       
          for(int i=1;i<=n;i++)
          {
              for(int j=1;j<=i;j++)
              {
                   System.out.print("*");                                     
          
              }
int space;
space=2*(n-i);
              for(int j=1;j<=space;j++)
              {
                   System.out.print(" ");                                     
          
              }            
              for(int j=1;j<=i;j++)
              {
                   System.out.print("*");                                     
          
              } 
         System.out.print("\n");                                     
                     
        
                           
          }





 //loop 1
       
          for(int i=n;i>=1;i--)
          {
              for(int j=1;j<=i;j++)
              {
                   System.out.print("*");                                     
          
              }
int space;
space=2*(n-i);
              for(int j=1;j<=space;j++)
              {
                   System.out.print(" ");                                     
          
              }            
              for(int j=1;j<=i;j++)
              {
                   System.out.print("*");                                     
          
              } 
         System.out.print("\n");                                     
                     
        
                           
          }

}

}